package tutorialsninja.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends BasePage{

    @FindBy(id = "top")
    private WebElement elContainer;

    @FindBy(id = "form-currency")
    private WebElement formCurrency;

    @FindBy(xpath = "//form[@id='form-currency']//button[.//span[.='Currency']]")
    private WebElement btnCurrency;

    @FindBy(id = "top-links")
    private WebElement elTopLinks;

    @FindBy(xpath = "//div[@id='top-links']//a[contains(., 'My Account')]")
    private WebElement lkMyAccount;

    @FindBy(xpath = "//div[@id='top-links']//a[.='Register']")
    private WebElement lkRegister;

    @FindBy(xpath = "//div[@id='top-links']//a[contains(., 'Login')]")
    private WebElement lkLogin;

    @FindBy(xpath = "//div[@id='top-links']//a[text()='My Account']")
    private WebElement lkSubMyAccount;

    @FindBy(xpath = "//div[@id='top-links']//a[text()='Order History']")
    private WebElement lkSubOrderHistory;

    @FindBy(xpath = "//div[@id='top-links']//a[text()='Transactions']")
    private WebElement lkSubTransactions;

    @FindBy(xpath = "//div[@id='top-links']//a[text()='Downloads']")
    private WebElement lkSubDownloads;

    @FindBy(xpath = "//div[@id='top-links']//a[text()='Logout']")
    private WebElement lkSubLogout;

    public TopBar(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectCurrency(String currency) {
        click(btnCurrency);

        By byCurrency = By.xpath(String.format(".//button[.='%s']", currency));
        click(formCurrency.findElement(byCurrency));
    }

    public void openRegister() {
        click(lkMyAccount);
        click(lkRegister);
    }

    public void openLogin() {
        click(lkMyAccount);
        click(lkLogin);
    }

    public void openMyAccount() {
        click(lkMyAccount);
        click(lkSubMyAccount);
    }

    public void openOrderHistory() {
        click(lkMyAccount);
        click(lkSubOrderHistory);
    }

    public void openTransactions() {
        click(lkMyAccount);
        click(lkSubTransactions);
    }

    public void openDownloads() {
        click(lkMyAccount);
        click(lkSubDownloads);
    }

    public void logout() {
        click(lkMyAccount);
        click(lkSubLogout);
    }

}
