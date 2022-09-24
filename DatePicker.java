package SeleniumPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<path of chromedriver>"); 	
        String url = "https://formy-project.herokuapp.com/datepicker";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/02/2345");
        dateField.sendKeys(Keys.RETURN);

        Thread.sleep(2000);
        driver.close();
    }
}
