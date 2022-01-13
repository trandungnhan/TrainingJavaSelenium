package automationpractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchCloths extends BaseTest{
    @Test
    public void searchTest() throws InterruptedException {

        WebElement txtSearch = driver.findElement(By.id("search_query_top"));
        txtSearch.sendKeys("T-shirt");

        WebElement btnSearch = driver.findElement(By.name("submit_search"));
        btnSearch.click();
    }
}