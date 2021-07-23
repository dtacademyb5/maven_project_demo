package demoTests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTest2 {








    @Test
    public  void resultsPageTitleTest(){
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.manage().window().maximize();


        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("rafaelaziz socks" + Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains("rafaelaziz socksz"));
        driver.quit();

    }


    @Test
    public  void resultsPageTitleTest2(){
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.manage().window().maximize();


        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("cheap socks" + Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains("cheap socks"));
        driver.quit();

    }
}
