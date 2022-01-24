package tutorialsninja.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Watchable;

public class ProductPage extends BasePage{

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
}
