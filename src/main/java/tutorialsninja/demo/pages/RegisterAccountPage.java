package tutorialsninja.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tutorialsninja.demo.dto.Account;
import tutorialsninja.demo.pages.BasePage;

public class RegisterAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement tbFirstName;

    @FindBy(name = "lastname")
    private WebElement tbLastName;

    @FindBy(xpath = "//input[@id = //label[.='E-Mail']/@for]")
    private WebElement tbEmail;

    @FindBy(xpath = "//input[@placeholder = 'Telephone']")
    private WebElement tbTelephone;

    @FindBy(id = "input-password")
    private WebElement tbPassword;

    @FindBy(id = "input-confirm")
    private WebElement tbPassConfirm;

    @FindBy(name = "agree")
    private WebElement chkAgree;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement btnContinue;

    public RegisterAccountPage(WebDriver webDriver){super(webDriver);}

    public void registerAccount(String firstName, String lastName, String email, String phone, String password) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(email);
        inputPhone(phone);
        inputPassword(password);
        inputConfirmPassword(password);
        checkAgreePolicy();

        clickContinue();
    }

    public void registerAccount(Account account) {
        registerAccount(account.getFirstName(), account.getLastName(), account.getEmail(), account.getPhone(), account.getPassword());
    }

    public void inputFirstName(String firstName) {
        inputText(tbFirstName, firstName);
    }

    public void inputLastName(String lastName) {
        inputText(tbLastName, lastName);
    }

    public void inputEmail(String email) {
        inputText(tbEmail, email);
    }

    public void inputPhone(String phone) {
        inputText(tbTelephone, phone);
    }

    public void inputPassword(String password) {
        inputText(tbPassword, password);
    }

    public void inputConfirmPassword(String password) {
        inputText(tbPassConfirm, password);
    }

    public void checkAgreePolicy() {
        click(chkAgree);
    }

    public void clickContinue() {
        click(btnContinue);
    }
}
