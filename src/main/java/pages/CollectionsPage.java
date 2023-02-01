package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import javax.xml.xpath.XPath;

   public class CollectionsPage extends WebTestBase {
       @FindBy(xpath = "(//span[text()='Women'])[1]")
    WebElement women1;

    @FindBy(xpath = "//i[@class='fa fa-angle ']")
    WebElement dropdown;
    @FindBy(xpath = "//div[@class='close_icon' ]")
    WebElement add;
   public CollectionsPage(){
       PageFactory.initElements(driver,this);
    }
    public void dropDownClick() {
        women1.click();
        driver.switchTo().frame("cmessage_form_iframe");
        add.click();
        Utility.selectDropdown(driver);

    }


   }
