package apidemo;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class DemoAppTesting {
	@Test
	public void Launchapidemo() throws MalformedURLException {
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("INBLRLT00007").usingPort(4723).withArgument(GeneralServerFlag.BASEPATH,"wd/hub").build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Harini");
		options.setApp(
				"C:\\Users\\Dell\\eclipse-workspace\\Testingdemoapp\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		//AndroidDriver
		AndroidDriver driver =new AndroidDriver(new URL("http://INBLRLT00007:4723/wd/hub"), options);
		//Actualautomation
		driver.quit();
		service.stop(); //stop server
	}

}
