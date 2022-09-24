package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<location of your driver>");
        String url = "https://formy-project.herokuapp.com/autocomplete";
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("XYZ");

        WebElement autocompleteResult = driver.findElement(By.className("abc"));
        autocompleteResult.click();


        Thread.sleep(1000);

        driver.quit();

    }
}
