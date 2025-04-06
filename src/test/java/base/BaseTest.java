package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;




    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        loginPage= new LoginPage(driver);
    }
    @BeforeMethod
    public void getUrl() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @AfterClass
    public void quite(){
//        driver.quit();
    }
}
