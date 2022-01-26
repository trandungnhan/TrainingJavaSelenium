package tutorialsninja.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import tutorialsninja.demo.dto.Product;
import tutorialsninja.demo.pages.BasePage;
import tutorialsninja.demo.pages.ProductComponent;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//h2")
    private WebElement elProductType;

    @FindBy(id = "list-view")
    private WebElement btnListView;

    @FindBy(id = "grid-view")
    private WebElement btnGridView;

    @FindBy(id = "input-sort")
    private Select slInputSort;

    @FindBy(id="input-limit")
    private Select slInputLimit;

    public ProductPage(WebDriver webDriver){ super(webDriver);}

    public void sortBy(String sortBy){ slInputSort.selectByVisibleText(sortBy);}

    public void show(int numberItems){ slInputLimit.selectByVisibleText(String.valueOf(numberItems));}

    public List<Product> getAllProducts(){
        By byProducts = By.xpath("//div[contains(@class, 'product-layout')]");
        List<WebElement> elProducts = webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byProducts));
        List<Product> products = new ArrayList<>();

        if (elProducts.size() == 0) {
            return products;
        }

        for (WebElement el : elProducts) {
            ProductComponent productComponent = new ProductComponent(webDriver, el);
            products.add(productComponent.getProduct());
        }
        return products;
    }

}
