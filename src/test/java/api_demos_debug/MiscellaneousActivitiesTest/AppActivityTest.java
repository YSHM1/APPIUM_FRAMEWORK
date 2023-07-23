package api_demos_debug.MiscellaneousActivitiesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppActivityTest extends BaseClass{
	
	@Test
	public void appActivityTest() throws InterruptedException {
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation rotation = new DeviceRotation(0, 0, 90);
		driver.rotate(rotation);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actualAlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actualAlertTitle, "WiFi settings");
		driver.setClipboardText("XtremeFibre");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		//key events
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

}
