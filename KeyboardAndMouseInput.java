package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/keypress";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Chromium");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
