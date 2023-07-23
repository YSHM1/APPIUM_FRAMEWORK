package api_demo_debug.GenericUtilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	@BeforeClass
	public void appiumConfiguration() throws MalformedURLException {
		
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:/Users/asus/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//							.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 2 XL_Emulator");
		options.setApp("E:/APPIUM_WORKSPACE/APPIUM_TEST_PRACTICE/src/test/resources/ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closeConnections() {
		driver.quit();
//		service.stop();
	}

}
