import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/JBL8/Documents/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        WebElement buttonOK = driver.findElement(By.className("dismissButton"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(buttonOK);
//        buttonOK.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();


        driver.quit();
    }
}
