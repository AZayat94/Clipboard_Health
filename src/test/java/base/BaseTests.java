package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.IOException;
import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    protected HomePage HomePage;



    @BeforeClass
    public  void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        HomePage = new HomePage(driver);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}