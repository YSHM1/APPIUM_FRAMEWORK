package api_demo_debug.GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class GesturesUtility {
	
	public void longClickGesture(AndroidDriver driver,WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", 
													ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(), "duration", 2000));
	}
	
//	public void scrollGestureUsingAndroidUIAutomator(AndroidDriver driver, String attribute, String text) {
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(+"attribute(text)"+);"));
//	}
	
	public void scrollTillEnd(AndroidDriver driver) {
		boolean canScrollFurther;
		do {
			canScrollFurther = (Boolean)((JavascriptExecutor)driver)
											.executeScript("mobile: scrollGesture", 
													ImmutableMap.of("left", 200, "top", 200, "width", 200, "height", 200,
																	"direction", "down", "percent", 3.0));
		}while(canScrollFurther);
	}
	
	public void scrollToStart(AndroidDriver driver) {
		boolean canScrollFurther;
		do {
			canScrollFurther = (Boolean)((JavascriptExecutor)driver)
											.executeScript("mobile: scrollGesture", 
													ImmutableMap.of("left", 200, "top", 200, "width", 200, "height", 200,
																	"direction", "up", "percent", 3.0));
		}while(canScrollFurther);
	}
	
	public void scrollDown(AndroidDriver driver) {
		boolean canScroll = (Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", 
													ImmutableMap.of("left", 200, "top", 200, "width", 200, "height", 200,
																	"direction", "down", "percent", 3.0));
	}
	
	public void scrollUp(AndroidDriver driver) {
		boolean canScroll = (Boolean)((JavascriptExecutor)driver)
											.executeScript("mobile: scrollGesture", 
													ImmutableMap.of("left", 200, "top", 200, "width", 200, "height", 200,
																	"direction", "up", "percent", 3.0));
	}
	
	public void swipeLeft(AndroidDriver driver, WebElement element) {
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(), 
						"direction", "left", "percent", 0.75));
	}
	
	public void dragAndDrop(AndroidDriver driver, WebElement element) {
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(), "endX", 831, "endY", 730));
	}

}
