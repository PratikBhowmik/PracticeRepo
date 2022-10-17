package corejavatwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://web-locators-static-site-qa.vercel.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        WebElement clickElement = driver.findElement(By.xpath("//a[@href='/Mouse']"));
        Actions act = new Actions(driver);
        act.click(clickElement).perform();

        js.executeScript("window.scrollBy(0,1300)");

        //WebElement hoverElement = driver.findElement(By.xpath("//div[@class = 'Mouse_section4']/p[text() = 'Password']"));
        //act.moveToElement(hoverElement).perform();

        WebElement dragmearound = driver.findElement(By.xpath("//div[text() = 'Drag me around']"));
        act.dragAndDropBy(dragmearound, 100, 100);

        WebElement dragAndDropElement = driver.findElement(By.xpath("//div[text() = 'Drag me to target']"));
        WebElement destination = driver.findElement(By.xpath("//div[@class = 'box drop-target react-draggable']"));

        act.dragAndDrop(dragAndDropElement, destination).build().perform();
        Thread.sleep(3000);
    }
}
