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

public class SamsungTvs {
    private  WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    private By Sort_List = By.xpath("//select[@id='s-result-sort-select']");
    private By All_Available_Tvs = By.xpath("//*[@class='s-main-slot s-result-list s-search-results sg-row']//span[@class='a-price']");

    public SamsungTvs(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(Sort_List));
    }
    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }
    public void SortHighToLow() throws InterruptedException {
        WaitUntilPageLoads();
        selectFromDropDown("Price: High to Low");
        }




    public void GetAllAvailableTvs(){
        List<WebElement> AvailableTvs = driver.findElements(All_Available_Tvs);
        AvailableTvs.get(2).click();
    }

    public void WaitUntilVisibility(By element){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public void WaitUntilClickability(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void WaitUntilPageLoads(){
        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }



}
