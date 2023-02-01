package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HoopsPage;
import pages.HomePage;
import testbase.WebTestBase;

public class Hoopstest extends WebTestBase {
    HomePage homePage;
    HoopsPage hoopsPage;
    public Hoopstest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage=new HomePage();
        hoopsPage=new HoopsPage();
    }
    @Test
    public void checkBoxClick(){
        hoopsPage.checkBoxHandle();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

