package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.nio.channels.SelectableChannel;
import java.sql.Driver;
import java.util.List;


     public class AlertTest {

         public WebDriver Driver;

         @Test
         public void registerTest() {
             System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
             Driver = new ChromeDriver();
             Driver.get("http://demo.automationtesting.in/Index.html");
             Driver.manage().window().maximize();

             WebElement skipSignIn = Driver.findElement(By.id("btn2"));
             skipSignIn.click();

             String expectedPage = "Register";
             String actualPage = Driver.getTitle();
             Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));


             WebElement switchElement= Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
             //cum facema ctiuni cu mouseul, te muti prin declararea unui obiect
             Actions action= new Actions(Driver);
             action.moveToElement(switchElement).build().perform();

             WebElement alertsElement= Driver.findElement(By.xpath("//a[text()='Alerts']"));
             alertsElement.click();

             //ca sa nu iti apara reclame sa navigheze pe alt browser de internet

             Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");




         }
     }