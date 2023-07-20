package CBTPages;

import DataProvider.Data;
import DataProvider.ElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver=driver;

    }
    public void login(){
        System.out.println("Login Page");
        driver.findElement(By.id(ElementPath.EMAIL_ID)).sendKeys(Data.LOGIN_EMAIL);
        driver.findElement(By.id(ElementPath.PASSWORD_ID)).sendKeys(Data.LOGIN_PWD);
        driver.findElement(By.className(ElementPath.LOGIN)).click();
        WebElement logo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id(ElementPath.HOME_POPUP)));
    driver.findElement(By.className(ElementPath.POPUP_CLOSE_BTN)).click();
        // Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement loader = wait.until(driver -> {
            return driver.findElement(By.className("center-center"));
        });
        System.out.println("Loader is over");

    }

}
