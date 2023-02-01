package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HoopsPage extends WebTestBase {
    @FindBy(xpath = "(//span[text()='Women'])[1]")
    WebElement women1;

    @FindBy(xpath = "//input[@value='hoops']")
    WebElement hoops;
    @FindBy(xpath = "//div[@class='close_icon' ]")
    WebElement add1;
    public HoopsPage(){
        PageFactory.initElements(driver,this);
    }
    public void checkBoxHandle(){
        women1.click();
        driver.switchTo().frame("cmessage_form_iframe");
        add1.click();
        Utility.selectDropdown(driver);
    }

}
