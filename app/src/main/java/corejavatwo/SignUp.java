package corejavatwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://unstop.com/auth/signup?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.findElement(By.id("first_name")).sendKeys("pratik");
        driver.findElement(By.id("last_name")).sendKeys("Bhowmik");
        driver.findElement(By.id("your_username")).sendKeys("username123");
        driver.findElement(By.xpath("//div[@id = 'mat-select-value-1']")).click();
        driver.findElement(By.xpath("//mat-option[1]")).click();
        driver.findElement(By.id("email_address")).sendKeys("impratikbhowmik@gmail.com");
        driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("8939117490");
        driver.findElement(By.id("mat-input-0")).click();
        driver.findElement(By.id("organisation-organisation_select_input")).sendKeys("HITS");
        driver.findElement(By.id("choose_password")).sendKeys("abc@123");
        driver.findElement(By.id("confirm_password")).sendKeys("abc@123");
    }
}
