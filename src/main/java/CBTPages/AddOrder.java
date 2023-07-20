package CBTPages;

import DataProvider.ElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AddOrder {
    WebDriver driver;
    public AddOrder(WebDriver driver){
        this.driver=driver;
    }
    public void addOrder(){
        System.out.println("ADD ORDER Page");
        // Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement loader = wait.until(driver -> {
            return driver.findElement(By.className("center-center"));
        });

        driver.findElement(By.className(ElementPath.ADD_ORDER)).click();
    }
}
