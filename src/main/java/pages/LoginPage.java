package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class LoginPage extends WebTestBase {
    @FindBy(xpath = "//a[@id='customer_login_link']")
    WebElement loginIcon;
    @FindBy(xpath = "//input[@name='customer[email]']")
    WebElement emailTextbox;
    @FindBy(xpath = "//input[@name='customer[password]']")
    WebElement passwordTextbox;
    @FindBy(xpath = "//input[@class='btn btn-login']")
    WebElement loginbtn;
    @FindBy(xpath = "//body[@id='challenge']")
    WebElement checkboxClick;
    public void loginClick(){
        loginIcon.click();
    }
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void login(String email1,String password1){
          loginIcon.click();
          emailTextbox.sendKeys(email1);
          passwordTextbox.sendKeys(password1);
          loginbtn.click();
          checkboxClick.click();

    }
}
