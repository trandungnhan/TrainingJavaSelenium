package phptravels.tests;

import org.testng.annotations.Test;
import phptravels.HomePage;

public class HomePageTests extends BaseTest {

    @Test
    public void navigationTests(){
        HomePage homePage = new HomePage(driver);
        homePage.gotoHotelsPage();

    }
}
