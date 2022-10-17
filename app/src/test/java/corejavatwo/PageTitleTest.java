package corejavatwo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class PageTitleTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.getCapability("Brave"); // read browser the driver will use
        capabilities.setCapability("Brave","Brave"); // set to use Chrome browser
        capabilities.setCapability("platform", "win11"); // set to use Windows 11 as the OS
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), desiredCapabilities);
    }

    @Test
    public void getPageTitle(){
        System.out.println("Your work will be remembered!!!");
    }
}
