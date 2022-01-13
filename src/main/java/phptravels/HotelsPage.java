package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage extends BasePage {

    @FindBy(id="checkin")
    private WebElement tbCheckIn;

    @FindBy(id="checkout")
    private WebElement tbCheckOut;

    @FindBy(css = "a.dropdown-btn.travellers")
    private WebElement lkTravellers;

    @FindBy(id="rooms")
    private WebElement tbRooms;

    @FindBy(id = "adults")
    private WebElement tbAdults;

    public HotelsPage(WebDriver webDriver){
        super(webDriver);

    }
    public void specifyCityName(String cityName) throws InterruptedException{
        By byCityContainer = By.id("select2-hotels_city-container");
        By byCityResults = By.xpath("input[@aria-controls='select2-hotels_city-results");
        By byCityLink = By.xpath(String.format("//li[contains(normalize-space(.),'%s')]", cityName));

        webDriver.findElement(byCityContainer).click();
        webDriver.findElement(byCityResults).sendKeys(cityName);

        Thread.sleep(3000);
        webDriver.findElement(byCityLink).click();

    }

    public void specifyCheckInDate(String date){
        setText(tbCheckIn, date);
    }
    public void specifyCheckOutDate(String date){

        setText(tbCheckOut, date);
    }

    public void specifyTravellers(int rooms, int adults, int[] children, String nationality){
        lkTravellers.click();
        setRooms(rooms);
        setAdults(adults);
    }
    private void setRooms(int rooms){
        setText(tbRooms, String.valueOf(rooms));
    }
    private void setAdults(int adults){
        setText(tbAdults, String.valueOf(adults));
    }

}
