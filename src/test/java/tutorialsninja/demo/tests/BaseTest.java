package tutorialsninja.demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------Before Method-------");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        webDriver.navigate().to("http://tutorialsninja.com/demo/");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("-----After Method-----");
        if (webDriver != null){
            System.out.println("Closing Browser...");
            webDriver.quit();
        }

    }
}
