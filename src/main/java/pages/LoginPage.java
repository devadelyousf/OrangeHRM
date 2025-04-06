package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.MethodHandels;

public class LoginPage extends MethodHandels {


    private final By email = By.xpath("//input[@name=\"username\"]");
    private final By password = By.xpath("//input[@name=\"password\"]");
    private final By submitButton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage enterEmailAndPasswordToLogin(String mail, String pass) {
        sendKey(email, mail);
        sendKey(password, pass);
        click(submitButton);
        return new HomePage(driver);
    }


}