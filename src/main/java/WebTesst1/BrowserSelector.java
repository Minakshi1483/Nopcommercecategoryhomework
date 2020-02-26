package WebTesst1;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;


public class BrowserSelector extends Utils {
    String browser = "chrome";

    public void setUpBrowser() {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else if
        (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resource/BrowserDrivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");

            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);
            ieCapabilities.setCapability("ignoreZoomSetting", true);

            driver = new InternetExplorerDriver(ieCapabilities);
            driver.manage().window().maximize();
            //enter URL
            driver.get("https://demo.nopcommerce.com/");

        } else {
            System.out.println("hello" + browser);
        }
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();


      //     public void closeBrowsers () {
       //         driver.close();}
            }


        }

    }