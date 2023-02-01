package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import javax.swing.*;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//div[@class='close_icon']")
    WebElement searchbtn;
@FindBy(xpath="//a[@id='customer_login_link']")
    WebElement loginIcon;
@FindBy(xpath = "(//span[text()='Women'])[1]")
WebElement women;
    @FindBy(xpath = "//li[@class='truecollections menu-lv-1 item dropdown mega-menu']")
    WebElement collectionsJewellary;
    @FindBy(xpath = "//i[@class='fa fa-facebook fa-lg']")
    WebElement facebookIcon;
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void loginClick(){
        loginIcon.click();
    }
    public void mouseHoverLogin(){
        Utility.mouseHover(driver, women);
    }
    public void clickOnCollection(){
        collectionsJewellary.click();
    }
    public void searchBtnClick(){
        searchbtn.click();
    }

    public void iconClick(){
        facebookIcon.click();

    }
    public void womenClick(){
        women.click();
    }



}
