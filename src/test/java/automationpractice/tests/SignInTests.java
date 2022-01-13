package automationpractice.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {
    @Test
    public void SignInTest() throws InterruptedException{

        Thread.sleep(2000);
        WebElement lkLogin = driver.findElement(By.partialLinkText("Sign in"));
        lkLogin.click();

        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys("imts.coaching.test@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("passwd"));
        txtPassword.sendKeys("123456");

        WebElement btnSignIn = driver.findElement(By.id("SubmitLogin"));
        btnSignIn.click();
    }
}
