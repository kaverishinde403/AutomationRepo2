package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage regsiterPage;
    public HomeTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        regsiterPage=new RegisterPage();
    }
    @Test
    public void loginBtnClick(){
        homePage.loginClick();

    }
    public void searchBtn(){
        homePage.searchBtnClick();
    }
    @Test
    public void mouseHoverElement(){
        homePage.mouseHoverLogin();
    }
    @Test
    public void collectionCilck(){
        homePage.clickOnCollection();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }


}
