package appium_setup_practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverSetup {
	
	@Test
	public void driverSetupTest() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 2 XL_Emulator");
		options.setApp("E:/APPIUM_WORKSPACE/APPIUM_TEST_PRACTICE/src/test/resources/ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.quit();
		
	}

}
