package SeleniumPrograms;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutingJavaScriptCommands {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/modal";
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", closeButton);
        Thread.sleep(2000);

        driver.quit();

    }
}
