package api_demos_debug.WiFiTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class WiFiSettingNameTest extends BaseClass{
	
	@Test
	public void wifiSettingNameTest() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actualAlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actualAlertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("XtremeFibre");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}

}
