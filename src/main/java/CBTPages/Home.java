package CBTPages;

import DataProvider.ElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class Home {
    WebDriver driver;
    public Home(WebDriver driver){
        this.driver=driver;
    }
    public void home(){
        System.out.println("Home Page");
        List<WebElement> menu= driver.findElement(By.className(ElementPath.MENU_BAR)).findElements(By.className(ElementPath.MENU_OPTION));
        menu.get(2).click();
        // Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement loader = wait.until(driver -> {
            return driver.findElement(By.className("center-center"));
        });





    }
}
