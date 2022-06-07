package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class RegisterTest {

    public WebDriver Driver;

    @Test
    public void registerTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        Driver= new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();

        WebElement SignInElement = Driver.findElement(By.id("btn2"));
        SignInElement.click();

        String expectedPage= "Register";
        String actualPage=Driver.getTitle();
        Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));


    }
}
