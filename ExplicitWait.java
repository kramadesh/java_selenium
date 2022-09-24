package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/dropdown";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get(url);

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

//        WebElement dropDownItem1 = driver.findElement(By.id("autocomplete"));
        WebElement dropDownItem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
        dropDownItem1.click();


        driver.navigate().back();


        //dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
        dropDownMenu.click();


        WebElement dropDownItem2 = driver.findElement(By.linkText("Checkbox"));
        dropDownItem2.click();

        Thread.sleep(2000);
        driver.close();
    }
}
