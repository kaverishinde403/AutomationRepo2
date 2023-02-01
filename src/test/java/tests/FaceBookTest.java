package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import pages.HomePage;
import testbase.WebTestBase;

public class FaceBookTest extends WebTestBase {
    HomePage homePage;
    FaceBookPage faceBookPage;
    public FaceBookTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage=new HomePage();
        faceBookPage=new FaceBookPage();
    }
    @Test
    public void multipleWindowHandles(){

        homePage.iconClick();
                faceBookPage.windowHandles();



    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
