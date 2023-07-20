package CBTPages;

import DataProvider.Constant;
import DataProvider.ElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SetUp {
    WebDriver driver;


    public WebDriver setup(){
        System.out.println("Setup Class");
        System.setProperty("webdriver.chrome.driver","/Users/neharani/Desktop/Automation/CBT/chromedriver");
        driver = new ChromeDriver();
        // browser type and chromedrover.exe path as parameters
        driver.navigate().to(Constant.URL);
        driver.manage().window().maximize();
        // explicit wait - to wait for the compose button to be click-able
        WebElement logo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(ElementPath.SHIPROCKET_LOGO)));
        return driver;
  }

}
