package phptravels.tests;

import org.testng.annotations.Test;
import phptravels.HomePage;
import phptravels.HotelsPage;

public class HotelsPageTests extends BaseTest {
    @Test
    public void hotelsSearchTests() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        HotelsPage hotelsPage = new HotelsPage(driver);
        hotelsPage.specifyCityName("London");
        hotelsPage.specifyCheckInDate("01-02-2022");
        hotelsPage.specifyCheckOutDate("05-02-2022");
        hotelsPage.specifyTravellers(1,2,new int[]{5},"Vietnam");

    }
}
