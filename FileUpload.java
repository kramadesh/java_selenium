package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/fileupload";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("image.jpg");
        Thread.sleep(2000);
        driver.quit();
    }
}
