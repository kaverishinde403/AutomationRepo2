package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import testbase.WebTestBase;

public class RegisterTest extends WebTestBase {
    HomePage homePage;
    RegisterPage regsiterPage;
    public RegisterTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage=new HomePage();
        regsiterPage=new RegisterPage();
    }
    @Test
    public void registration(){
        homePage.loginClick();
        regsiterPage.regsiter(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("email"),prop.getProperty("password"));
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}

