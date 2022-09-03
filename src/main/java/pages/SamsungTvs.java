package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SamsungTvs {
    private  WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    private By Sort_List = By.xpath("//select[@id='s-result-sort-select']");

    public SamsungTvs(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(Sort_List));
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public void SortHighToLow(){
        selectFromDropDown("Price: High to Low");
    }

    public void WaitUntilVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
