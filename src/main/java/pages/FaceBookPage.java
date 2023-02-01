package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class FaceBookPage extends WebTestBase {
    @FindBy(xpath = "//div[@class='close_icon']")
    WebElement closeAd;
    public FaceBookPage(){
        PageFactory.initElements(driver,this);
    }

    public void windowHandles(){
        Utility.getWindowHandles(driver);
    }

    public void closeAdvertise(){
        closeAd.click();
    }
}
