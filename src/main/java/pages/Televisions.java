package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Televisions {
    private  WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;
    private By Samsung_Brand = By.xpath("//*[@class='a-size-base a-color-base'][normalize-space()='Samsung']");

    public Televisions(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    }

    public SamsungTvs Filter_With_Samsung_Brand(){
        ScrollIntoView(Samsung_Brand);
        driver.findElement(Samsung_Brand).click();
        return new SamsungTvs(driver);
    }
    public void ScrollIntoView(By element){
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(element));
    }

    public void WaitUntilVisibility(By element){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }
}
