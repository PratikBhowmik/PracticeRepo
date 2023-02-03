package BIprojectCrio;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bi_Project {
    public static ChromeDriver createDriver() {
        //TODO Create a new chrome Driver and Return the same
        return new ChromeDriver();
    }

    public static void printQKartLoadingtime(ChromeDriver driver) {
        //TODO Navigate to home page of QKart and verify the time taken for the page to load
        int startTime;
        int endTime;
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");

    }

    public static void captureFullPageScreenshot(ChromeDriver driver) {
        //TODO: Capture the full page screenshot
        //Save the file with a unique name
        // Print the path of the file
    }

    public static void GetProductImageandURL(ChromeDriver driver, String productName) throws InterruptedException {
        //TODO: Given the product name, print the price of the project and the url of the image
    }

    public static void main(String[] args) {
        ChromeDriver driver = createDriver();
        String input = String.join(" ", args);
        try {

            printQKartLoadingtime(driver);

            captureFullPageScreenshot(driver);

            GetProductImageandURL(driver, input);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();

        }
    }
}
