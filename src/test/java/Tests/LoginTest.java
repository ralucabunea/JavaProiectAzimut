package Tests;

        import org.junit.Assert;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public WebDriver Driver;

    @Test
    public void MetodaLogin(){

        // Setam driverul de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

        // Deschidem un browser de Chrome
        Driver = new ChromeDriver();


        // Accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        // Maximizam pagina de testare
        Driver.manage().window().maximize();


        // Identificam butonul Sign In
        WebElement SignInElement = Driver.findElement(By.id("btn1"));
        SignInElement.click();


        // Identificam butonul LOG IN -intri pe site, pagina de login , click dr pt inspect si trb sa apara la consola "title" pus automat
        String expectedPage= "SignIn";
        String actualPage= Driver.getTitle();
        Assert.assertEquals("The expected page was not displayed", expectedPage, actualPage);


        // Identificam butonul de email
        WebElement EmailElement = Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String EmailValue = "abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        WebElement PasswordElement = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String PasswordValue = "12345";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterElement = Driver.findElement(By.id("enterbtn"));
        EnterElement.click();



        //Validam mesaj de eroare "invalid user name and password"
        WebElement mesageElement= Driver.findElement(By.id("errormsg"));
        String expectedError= "Invalid User Name or PassWord";
        String actualError= mesageElement.getText();
        //introducem un mesaj prin care sa vedem daca cumva e ceva gresit si nu e conform cu ce apare pe site
        Assert.assertEquals("Text of the error displayed is not correct!", expectedError, actualError);

        // Inchidem paginile cu testele trecute sa nu fie pastrate in bara de jos
        //Driver.close();
        //SAU se mai poate face prin urm metoda:
        Driver.quit();    // recomandat de folosit
        //dif intre close si quit : close inchide cate un tab  si quit toata pagina-dac ai un browser cu 2 taburi deschise, close inchide tabul curent si quit toate




    }

}
