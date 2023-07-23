package api_demos_debug.GesturesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import api_demo_debug.GenericUtilities.GesturesUtility;
import io.appium.java_client.AppiumBy;

public class LongPressTest extends BaseClass {
	
	@Test
	public void longPressTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
//		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", 
//														ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(), "duration", 2000));
		GesturesUtility gestures = new GesturesUtility();
		gestures.longClickGesture(driver, ele);
		String menuText = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		
	}

}
