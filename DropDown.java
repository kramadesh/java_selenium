package SeleniumPrograms;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "<path of chromedriver>");
        String url = "https://formy-project.herokuapp.com/dropdown";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement dropDownItem1 = driver.findElement(By.id("autocomplete"));
        dropDownItem1.click();

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        Thread.sleep(2000);

        WebElement dropDownItem2 = driver.findElement(By.linkText("Checkbox"));
        dropDownItem2.click();

        Thread.sleep(2000);
        driver.close();

    }
}
