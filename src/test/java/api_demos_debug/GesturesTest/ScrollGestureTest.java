package api_demos_debug.GesturesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import api_demo_debug.GenericUtilities.BaseClass;
import api_demo_debug.GenericUtilities.GesturesUtility;
import io.appium.java_client.AppiumBy;

public class ScrollGestureTest extends BaseClass{
	
	@Test
	public void scrollGestureTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")); //Recommended when where to scroll is known
		GesturesUtility gestures = new GesturesUtility();
		gestures.scrollDown(driver);
		Thread.sleep(2000);
		gestures.scrollUp(driver);
		Thread.sleep(2000);
		gestures.scrollTillEnd(driver);
		Thread.sleep(2000);
		gestures.scrollToStart(driver);
	}

}
