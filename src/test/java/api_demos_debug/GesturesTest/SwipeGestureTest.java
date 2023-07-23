package api_demos_debug.GesturesTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import api_demo_debug.GenericUtilities.BaseClass;
import api_demo_debug.GenericUtilities.GesturesUtility;
import io.appium.java_client.AppiumBy;

public class SwipeGestureTest extends BaseClass{
	@Test
	public void swipeGestureTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
		WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		Assert.assertEquals(firstImage.getAttribute("focusable"), "true");
		
//		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
//										ImmutableMap.of("elementId", ((RemoteWebElement)firstImage).getId(), 
//															"direction", "left", "percent", 0.75));
		GesturesUtility gestures = new GesturesUtility();
		gestures.swipeLeft(driver, firstImage);
		Assert.assertEquals(firstImage.getAttribute("focusable"), "false");
	}

}
