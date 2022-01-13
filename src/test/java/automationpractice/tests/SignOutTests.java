package automationpractice.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignOutTests {

    @Test
    public void singOutTests() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebElement lkLogout = driver.findElement(By.cssSelector("a.logout"));
        lkLogout.click();
    }
}
