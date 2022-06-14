package Utils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver
{
    public static IOSDriver driver;
    @BeforeTest
    public static IOSDriver getDriver() throws MalformedURLException {

        if (driver == null) {
            SimulatorStart.runSimulator();
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("udid", "30350333-035C-4FB4-848F-ACBF5E558545");
            dc.setCapability("platformName", "iOS");
            dc.setCapability("deviceName", "iPhone 13 Pro Max");
            dc.setCapability("platformVersion", "15.4");
            dc.setCapability("app", "/Users/ugurbaykoc/IdeaProjects/NormaIOS/src/test/resources/AppFile/Norma.app");
            dc.setCapability("unicodeKeyboard", false);
            dc.setCapability("resetKeyboard", false);
            dc.setCapability("ignoreUnimportantViews", false);
            dc.setCapability(IOSMobileCapabilityType.SUPPORTS_ALERTS, true);
            dc.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);

            dc.setCapability(MobileCapabilityType.FULL_RESET, false);
            dc.setCapability(IOSMobileCapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        }

        return driver;
    }
    @AfterSuite
    public void closeDriver ()
    {

        if (driver != null) {
            driver.quit();

            driver = null;
        }

    }
}
