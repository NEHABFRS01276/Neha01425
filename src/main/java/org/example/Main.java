package org.example;
import CBTPages.AddOrder;
import CBTPages.Home;
import CBTPages.Login;
import CBTPages.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Main {
    WebDriver driver;
    @Test
    public void main() {
        System.out.println("Hello world!");
        SetUp setup = new SetUp();
        driver = setup.setup();
        Login login= new Login(driver);
        login.login();
        Home home=new Home(driver);
        home.home();
        AddOrder addOrder= new AddOrder(driver);
        addOrder.addOrder();
    }
}