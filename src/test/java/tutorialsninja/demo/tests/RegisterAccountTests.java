package tutorialsninja.demo.tests;

import org.testng.annotations.Test;
import tutorialsninja.demo.dto.Account;
import tutorialsninja.demo.pages.RegisterAccountPage;
import tutorialsninja.demo.pages.TopBar;
import tutorialsninja.demo.tests.dataproviders.AccountDataProviders;

import java.io.File;

public class RegisterAccountTests extends BaseTest {

    @Test
    public void registerAccountTest1(){
        TopBar topBar = new TopBar(webDriver);
        topBar.openRegister();

        RegisterAccountPage registerAccountPage = new RegisterAccountPage(webDriver);
        registerAccountPage.registerAccount("ITMS", "Coaching", "itms.coaching.test.1@gmail.com", "123456789", "123456");
    }

    @Test
    public void registerAccountTest2() {
        TopBar topBar = new TopBar(webDriver);
        topBar.openRegister();

        RegisterAccountPage registerAccountPage = new RegisterAccountPage(webDriver);
        registerAccountPage.registerAccount("ITMS", "Coaching", "itms.coaching.test.2@gmail.com", "123456789", "123456");
    }

    @Test(dataProvider = "RegisterAccount", dataProviderClass = AccountDataProviders.class)
    public void registerAccountTest(Account account){
        TopBar topBar = new TopBar(webDriver);
        topBar.openRegister();
        RegisterAccountPage registerAccountPage = new RegisterAccountPage(webDriver);
        registerAccountPage.registerAccount(account);
    }

    @Test(dataProvider = "RegisterInvalidAccounts", dataProviderClass = AccountDataProviders.class)
    public void registerInvalidAccountTest(Account account) {
        TopBar topBar = new TopBar(webDriver);
        topBar.openRegister();
        RegisterAccountPage registerAccountPage = new RegisterAccountPage(webDriver);

        registerAccountPage.registerAccount(account);

        // Verify error message for missing fields
    }
}
