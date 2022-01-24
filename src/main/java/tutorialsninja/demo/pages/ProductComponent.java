package tutorialsninja.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductComponent extends BasePage{

    private WebElement container;

    public ProductComponent(WebDriver webDriver) {
        super(webDriver);
        this.container = container;
    }

    public ProductComponent(WebDriver webDriver, String productName){
        super(webDriver);

        By byContainer = By.xpath(String.format("//div[contains(@class, 'product-layout')][.//a[normalize-space(.) = '%s']]", productName));
        this.container = webDriver.findElement(byContainer);
    }

    public String getImage(){
        By byImage = By.xpath("//div[@class = 'image']//img");
        String src = this.container.findElement(byImage).getAttribute("src");
        int lastPos = src.lastIndexOf("/");
        return src.substring(lastPos + 1, src.length());
    }

    public String getProductName(){
        By byProductName = By.xpath("//h4//a");
        return this.container.findElement(byProductName).getText();
    }

}
