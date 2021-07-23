import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestingMaven {

    public static void main(String[] args) {

        System.out.println("hello");

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.manage().window().maximize();


        driver.get("https://www.dice.com/");

        Faker fake = new Faker();

        System.out.println(fake.chuckNorris().fact());





    }
}
