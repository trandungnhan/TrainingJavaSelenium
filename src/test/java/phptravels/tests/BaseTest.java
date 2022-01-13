package phptravels.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest // TestNG Annotation, the method will be executed before each test
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Launch website
        driver.navigate().to("http://https://phptravels.net//");
    }

    @AfterTest // TestNG Annotation, the method will be executed after each test
    public void afterTest() {
        driver.quit();
    }

}
