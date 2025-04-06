package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    private static final String userName = "Admin";
    private static final String password = "admin123";

    @Test
    public void enterEmailAndPasswordToLogin() {
        var homePage = loginPage.enterEmailAndPasswordToLogin(userName, password);
        homePage.clickOnAdminLink();
       homePage.numberOfRecords();
       homePage.addEmployee();
       homePage.fillRequireData();
       homePage.numberOfRecords();
        homePage.searchWithName();

    }
}
