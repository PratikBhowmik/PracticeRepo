package corejavatwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
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

        WebElement clickElement = driver.findElement(By.xpath("//a[@href='/Auto-complete']"));
        Actions act = new Actions(driver);
        act.click(clickElement).perform();


        WebElement autoComplete = driver.findElement(By.xpath("//input"));

        act.click(autoComplete).sendKeys("Art").perform();

        WebElement searchElement = driver.findElement(By.xpath("//div[@title = 'Gladiator']"));

        act.click(searchElement).perform();

//        js.executeScript("window.scrollBy(0,900)");

//        WebElement namefield = driver.findElement(By.xpath("//input[@placeholder = 'Name of  the user']"));
//
//        namefield.sendKeys("Pratik");
//
//        act.sendKeys(Keys.TAB);
//
//        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder = 'example@example.com']"));
//
//        emailField.sendKeys("impratikbhowmik@gmail.com");
//
//        act.sendKeys(Keys.TAB);
//
//        WebElement phoneNumber = driver.findElement(By.xpath("//input[@type = 'number']"));
//
//        phoneNumber.sendKeys("123456");
//
//        phoneNumber.sendKeys(Keys.TAB);
//
//        WebElement copyPasteElement = driver.findElement(By.xpath("//div[text() = 'Copy me and paste me in the below box']"));
//
//        act.click(copyPasteElement).perform();
//
//        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//
//        WebElement pasteElement = driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
//
//        act.click(pasteElement).perform();
//
//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//        WebElement hoverElement = driver.findElement(By.xpath("//div[@class = 'Mouse_section4']/p[text() = 'Password']"));
//        act.moveToElement(hoverElement).perform();
//
//        WebElement dragmearound = driver.findElement(By.xpath("//div[text() = 'Drag me around']"));
//        act.dragAndDropBy(dragmearound, 100, 100);
//
//        WebElement dragAndDropElement = driver.findElement(By.xpath("//div[text() = 'Drag me to target']"));
//        WebElement destination = driver.findElement(By.xpath("//div[@class = 'box drop-target react-draggable']"));
//
//        act.dragAndDrop(dragAndDropElement, destination).build().perform();
    }
}
