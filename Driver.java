/**
 * Created by pafkaodessa on 4/20/16.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;

    public void startWebDriverFirefox() throws IOException{

        File extensionFF = new File("firebug-2.0.xpi");
        FirefoxProfile profile = new FirefoxProfile();
        profile.addExtension(extensionFF);

        DesiredCapabilities capabilitiesFF =  DesiredCapabilities.firefox();

        capabilitiesFF.setCapability(FirefoxDriver.PROFILE, profile);
        driver =  new FirefoxDriver(capabilitiesFF);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void startWebDriverChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        File extensionChrome = new File("CSS-and-XPath-checker_v0.7.crx");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(extensionChrome);
        options.addArguments("--start-maximized");

        DesiredCapabilities capabilitiesChrome = DesiredCapabilities.chrome();

        capabilitiesChrome.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilitiesChrome);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void stopWebDriver() {
        driver.quit();
    }

}