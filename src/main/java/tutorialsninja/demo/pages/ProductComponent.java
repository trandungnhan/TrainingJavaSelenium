package tutorialsninja.demo.pages;

import tutorialsninja.demo.dto.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tutorialsninja.demo.pages.BasePage;

public class ProductComponent extends BasePage {

    private WebElement container;

    public ProductComponent(WebDriver webDriver, WebElement container) {
        super(webDriver);
        this.container = container;
    }

    public ProductComponent(WebDriver webDriver, String productName){
        super(webDriver);

        By byContainer = By.xpath(String.format("//div[contains(@class, 'product-layout')][.//a[normalize-space(.) = '%s']]", productName));
        this.container = webDriver.findElement(byContainer);
    }

    public Product getProduct(){
        Product product = new Product();
        product.setImage(getImage());
        product.setName(getProductName());
        product.setDescription(getProductDescription());
        product.setNewPrice(getNewPrice());
        product.setOldPrice(getOldPrice());
        product.setTax(getTax());
        product.setPrice(getPrice());

        return product;
    }

    public String getImage(){
        By byImage = By.xpath("//div[@class = 'image']//img");
        String src = this.container.findElement(byImage).getAttribute("src");
        int lastPos = src.lastIndexOf("/");
        return src.substring(lastPos + 1);
    }

    public String getProductName(){
        By byProductName = By.xpath("//h4//a");
        return this.container.findElement(byProductName).getText();
    }

    public String getProductDescription(){
        By byProductDescription = By.xpath(".//h4/following-sibling::p[1]");
        return this.container.findElement(byProductDescription).getText();
    }

    public String getPrice() {
        By byPrice = By.xpath(".//p[@class='price']");
        By byTax = By.xpath(".//span[@class='price-tax']");

        if (getOldPrice() == null && getNewPrice() == null) {
            String allPrice = this.container.findElement(byPrice).getText();
            String tax = this.container.findElement(byTax).getText();
            return allPrice.replace(tax, "").trim();
        }
        return null;
    }

    public String getNewPrice(){
        By byNewPrice = By.xpath(".//span[@class='price-new']");
        if (this.container.findElements(byNewPrice).size() == 0) {
            return null;
        }
        return this.container.findElement(byNewPrice).getText();
    }

    public String getOldPrice(){
        By byOldPrice = By.xpath(".//span[@class='price-old']");
        if(this.container.findElements(byOldPrice).size() == 0){
            return null;
        }
        return this.container.findElement(byOldPrice).getText();
    }

    public String getTax(){
        By byTax = By.xpath(".//span[@class='price-tax']");
        String text = this.container.findElement(byTax).getText();
        return text.substring(text.indexOf("$"));
    }


}
