package selenium.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class YourFirstSeleniumTest {

    @Test
    public void initBrowserDriverTest() {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Launch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");

        // Click on the search button
        driver.findElement(By.name("btnK")).click();
    }

    @Test
    public void initWebDriverManagerTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");

//        Thread.sleep(3000);
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.elementToBeClickable(By.name("btnk")));

        // Click on the search button
        driver.findElement(By.name("btnK")).click();
        driver.quit();
    }
}
