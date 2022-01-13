package automationpractice.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SignUpTests {

    @Test
    public void SignUpTests() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.navigate().to("http://automationpractice.com/");

        Thread.sleep(5000);
        WebElement lkLogin = driver.findElement(By.cssSelector("a.login"));
        lkLogin.click();

        Thread.sleep(5000);
        WebElement txtEmail = driver.findElement(By.cssSelector("input#email_create"));
        txtEmail.sendKeys("imts.coaching.test5@gmail.com");

        Thread.sleep(2000);
        WebElement btnCreateAccount = driver.findElement(By.cssSelector("button#SubmitCreate"));
        btnCreateAccount.click();

        Thread.sleep(10000);
        WebElement btnGender = driver.findElement(By.cssSelector("input#id_gender1"));
        btnGender.click();

        WebElement txtCusFirstName = driver.findElement(By.cssSelector("input#customer_firstname"));
        txtCusFirstName.sendKeys("ITMS");

        WebElement txtCusLastName = driver.findElement(By.cssSelector("input#customer_lastname"));
        txtCusLastName.sendKeys("Coaching");

        WebElement txtPassword = driver.findElement(By.cssSelector("input#passwd"));
        txtPassword.sendKeys("123456");

        WebElement eDays = driver.findElement(By.cssSelector("select#days"));
        Select slDays = new Select(eDays);
        slDays.selectByValue("22");

        WebElement eMonths = driver.findElement(By.cssSelector("select#months"));
        Select slMonths = new Select(eMonths);
        slMonths.selectByValue("12");

        WebElement eYears = driver.findElement(By.cssSelector("select#years"));
        Select slYears = new Select(eYears);
        slYears.selectByValue("1989");

        WebElement chkNewsletter = driver.findElement(By.cssSelector("input#newsletter"));
        chkNewsletter.click();

        WebElement txtFirstName = driver.findElement(By.cssSelector("input#firstname"));
        txtFirstName.sendKeys("ITMS");

        WebElement txtLastName = driver.findElement(By.cssSelector("input#lastname"));
        txtLastName.sendKeys("Coaching");

        WebElement txtCompany = driver.findElement(By.cssSelector("input#company"));
        txtCompany.sendKeys("ITMS Company");

        WebElement txtAddress1 = driver.findElement(By.cssSelector("input#address1"));
        txtAddress1.sendKeys("123");

        WebElement txtAddress2 = driver.findElement(By.cssSelector("input#address2"));
        txtAddress1.sendKeys("Binh Dinh");

        WebElement txtCity = driver.findElement(By.cssSelector("input#city"));
        txtCity.sendKeys("HCM");

        WebElement elState = driver.findElement(By.cssSelector("select#id_state"));
        Select slState = new Select(elState);
        slState.selectByVisibleText("Alaska");

        WebElement txtPostCode = driver.findElement(By.cssSelector("input#postcode"));
        txtPostCode.sendKeys("00000");

        WebElement elCountry = driver.findElement(By.cssSelector("select#id_country"));
        Select slCountry = new Select(elCountry);
        slCountry.selectByVisibleText("United States");

//        WebElement txtOther = driver.findElement(By.cssSelector("textarea#other"));
        WebElement txtOther = driver.findElement(By.id("other"));
        txtOther.sendKeys("This is additional information");

        WebElement txtPhone = driver.findElement(By.cssSelector("input#phone"));
        txtPhone.sendKeys("0989898989");

        WebElement txtMobile = driver.findElement(By.cssSelector("input#phone_mobile"));
        txtMobile.sendKeys("0999999999");

        WebElement txtAliasAddress = driver.findElement(By.cssSelector(" input#alias"));
        txtAliasAddress.sendKeys("999 Nguyen Thuong Hien");

        WebElement btnSubmitAccount = driver.findElement(By.cssSelector("button#submitAccount"));
        btnSubmitAccount.click();
    }

}
