package appiumandroidtest;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class setup {
		
	protected static AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
      
    public static void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();        
        capabilities.setCapability("deviceName", "Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("browserName","Chrome");      
        capabilities.setCapability("appium:appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability("nativeWebScreenshot", true);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver =  new AndroidDriver<MobileElement>(url, capabilities);
        driver.get("https://buggy.justtestit.org");
    } 
}	


