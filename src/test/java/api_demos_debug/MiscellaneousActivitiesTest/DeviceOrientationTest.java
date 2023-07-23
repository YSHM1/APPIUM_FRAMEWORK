package api_demos_debug.MiscellaneousActivitiesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class DeviceOrientationTest extends BaseClass {
			@Test
		public void deviceOrientationTest() {
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			// Device Rotation
			DeviceRotation rotation = new DeviceRotation(0, 0, 90);
			driver.rotate(rotation);
			driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
			String actualAlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
			Assert.assertEquals(actualAlertTitle, "WiFi settings");
			driver.findElement(By.id("android:id/edit")).sendKeys("XtremeFibre");
			driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		}

	}
