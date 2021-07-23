package demoTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SmokeTests {

    WebDriver driver;

    @BeforeClass
      public void setupClass(){
        WebDriverManager.chromedriver().setup();


      }

    @AfterClass
    public void tearDownClass(){



    }


    @BeforeMethod
    public void setupMethod(){
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }






    @Test
    public  void resultsPageTitleTest(){

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("rafaelaziz socks" + Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains("rafaelaziz socks"));


    }


    @Test

    public  void resultsPageTitleTest2(){

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("cheap socks" + Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains("cheap socks"));


    }
}
