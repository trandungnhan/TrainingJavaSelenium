package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(linkText = "Hotels")
    private WebElement lkHotels;


    @FindBy(linkText = "flights")
    private WebElement lkFlights;

    @FindBy(linkText = "Tours")
    private WebElement lkTours;

    public HomePage(WebDriver webDriver){ super(webDriver);}

    public void gotoHotelsPage(){lkHotels.click();}

    public void gotoFlightsPage(){
        lkFlights.click();
    }

    public void gotoToursPage(){
        lkTours.click();
    }
}
