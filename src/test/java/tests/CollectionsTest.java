package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CollectionsPage;
import pages.HomePage;
import testbase.WebTestBase;

public class CollectionsTest extends WebTestBase {
    CollectionsPage collectionsPage;
    HomePage homePage;

    public CollectionsTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        collectionsPage=new CollectionsPage();
        homePage=new HomePage();
    }
    @Test
    public void verifyDropDown() {
        collectionsPage.dropDownClick();
    }

    @AfterMethod
    public void aftermethod(){
        driver.close();
    }
}
