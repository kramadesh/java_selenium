package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class FormFilling {
    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/form";
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        submitForm(driver);
        waitForAlertBanner(driver);

        try{
            assertEquals("The form was successfully submitted!", getBannerText(driver));
        }catch(org.junit.ComparisonFailure e){
            System.out.println("Exception thrown"+ e.getMessage());
        }

        driver.quit();
    }
    public static void submitForm(WebDriver driver){
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Max");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Planck");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Physicist");

        WebElement education = driver.findElement(By.cssSelector("input[id='radio-button-3']"));
        education.click();

        WebElement sex = driver.findElement(By.cssSelector("input[id='checkbox-1']"));
        sex.click();

        Select years = new Select(driver.findElement(By.id("select-menu")));

        years.selectByVisibleText("10+");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();

        WebElement formDate = driver.findElement(By.id("datepicker"));
        formDate.sendKeys(dtf.format(now));

        WebElement submitButton = driver.findElement(By.cssSelector("div.col-sm-4.col-sm-offset-2 a.btn.btn-lg.btn-primary"));
        submitButton.click();
    }

    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }

    public static String getBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
