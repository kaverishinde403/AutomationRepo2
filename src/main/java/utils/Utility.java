package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void mouseHover(WebDriver driver,WebElement women){
        Actions action=new Actions(driver);
        action.moveToElement(women).build().perform();
    }
   /*public static void selectValue(WebElement element,String term,String value){
        Select drop=new Select(element);
        if(term.equalsIgnoreCase("byvalue")){
            drop.selectByValue(value);
        }else if(term.equalsIgnoreCase("byIndex")){
            drop.selectByIndex(Integer.parseInt(value));
        }else if(term.equalsIgnoreCase("byVisibleText")){
            drop.selectByVisibleText(value);
        }else{
            System.out.println("please select the correct value");
        }

    }*/
   public static void selelctValue(List<WebElement> list, String value){
       for(WebElement e:list){
           System.out.println(e.getText());
           if (e.getText().equalsIgnoreCase(value)){
               e.click();
               break;
           }
       }
   }
    public static void getWindowHandles(WebDriver driver) {
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
            driver.switchTo().window(parent);
        }
    }
        public static void selectDropdown(WebDriver driver){
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath(("//div[@class='limited-view']")));
            List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//child::li/span"));
            for(WebElement e:elements){
                System.out.println(e.getText());
                if(e.getText().equalsIgnoreCase("16")){
                    e.click();
                    break;

            }
        }

        }
    }


