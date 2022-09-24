package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
	String url = "https://formy-project.herokuapp.com/scroll";
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Chromium Web Browser");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2022");

        Thread.sleep(1000);

        driver.quit();

    }
}
