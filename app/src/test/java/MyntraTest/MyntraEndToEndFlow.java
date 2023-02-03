package MyntraTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyntraEndToEndFlow {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com");
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']"));
        searchBar.clear();
        searchBar.sendKeys("shoe");
        Thread.sleep(3000);
        searchBar.sendKeys(Keys.ENTER);
//        WebElement plantElFromDropdown = driver.findElement(By.xpath("//div[@class = ' desktop-autoSuggest desktop-showContent']//li[text() = 'Plants For Women']"));
//        plantElFromDropdown.click();
        Thread.sleep(3000);
        WebElement fifthElement = driver.findElement(By.xpath("(//ul[@class = 'results-base']//li)[5]"));
        fifthElement.click();

        String currentWindow = driver.getWindowHandle();

        Set<String> allWindowHandle = driver.getWindowHandles();

        Iterator<String> i = allWindowHandle.iterator();
        while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(currentWindow)){
                driver.switchTo().window(childwindow);

                Thread.sleep(6000);
                WebElement addToBagBtn = driver.findElement(By.xpath("//div[text() = 'ADD TO BAG']"));
                addToBagBtn.click();

                Thread.sleep(3000);
                WebElement cartBtn = driver.findElement(By.xpath("//a[@class = 'pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']"));
                cartBtn.click();

                WebElement invisibleEl = driver.findElement(By.xpath("//div[@class = 'itemComponents-base-invisibleBackDrop']"));
                invisibleEl.click();

                Thread.sleep(3000);
                WebElement removeBtn = driver.findElement(By.xpath("//button[text()='REMOVE']"));
                removeBtn.click();


            } else {
                System.out.println("There are no children");
            }
        }

        driver.switchTo().window(currentWindow);




    }
}
