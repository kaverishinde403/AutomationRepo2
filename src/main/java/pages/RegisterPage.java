package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class RegisterPage extends WebTestBase {
    @FindBy(xpath = "//a[@class='btn btn-register']")
    WebElement createBtn;
    @FindBy(xpath = "//input[@name=\"customer[first_name]\"]")
    WebElement firstNameTextbox;
    @FindBy(xpath ="//input[@name=\"customer[last_name]\"]")
            WebElement lastNameTextbox;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailTextbox;
    @FindBy(xpath="//input[@id='create_password']")
    WebElement paswordTextbox;
    @FindBy(xpath = "//input[@class='btn btn-padd42']")
    WebElement clickbtn;
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    public void regsiter(String fisrtName,String lastName,String email,String password){
        createBtn.click();
        firstNameTextbox.sendKeys(fisrtName);
        lastNameTextbox.sendKeys(lastName);
        emailTextbox.sendKeys(email);
        paswordTextbox.sendKeys(password);
        clickbtn.click();
    }
}
