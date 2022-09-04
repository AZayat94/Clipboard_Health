package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondHighestPricedTv {
    private  WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    public SecondHighestPricedTv(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }
    private By About_This_Item_Section = By.xpath("//div[@id='featurebullets_feature_div']");


    public WebElement AboutThisItemSection(){
        ScrollIntoView(About_This_Item_Section);
       return driver.findElement(About_This_Item_Section);
    }
    public String GetSectionInfoText(){
       return driver.findElement(About_This_Item_Section).getText();
    }
    public void ScrollIntoView(By element){
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(element));
    }
}
