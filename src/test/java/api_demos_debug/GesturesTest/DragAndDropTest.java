package api_demos_debug.GesturesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import api_demo_debug.GenericUtilities.GesturesUtility;
import io.appium.java_client.AppiumBy;

public class DragAndDropTest extends BaseClass {
	@Test
	public void drangAndDropTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		GesturesUtility gestures = new GesturesUtility();
		gestures.dragAndDrop(driver, source);
		String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(result, "Dropped!");
	}
}
