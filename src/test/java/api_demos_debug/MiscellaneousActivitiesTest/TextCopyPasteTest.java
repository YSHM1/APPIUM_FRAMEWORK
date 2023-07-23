package api_demos_debug.MiscellaneousActivitiesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class TextCopyPasteTest extends BaseClass{
	@Test
	public void textCopyPasteTest() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation rotation = new DeviceRotation(0, 0, 90);
		driver.rotate(rotation);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actualAlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actualAlertTitle, "WiFi settings");
		//Copy Paste
		driver.setClipboardText("XtremeFibre");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}

}
