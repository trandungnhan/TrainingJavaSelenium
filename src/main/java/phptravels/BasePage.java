package phptravels;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;
    JavascriptExecutor jsExecutor;


    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        jsExecutor = (JavascriptExecutor) webDriver;

        PageFactory.initElements(webDriver,this);
    }
    protected void setText(WebElement el, String text){
        jsExecutor.executeScript("arguments[0].setAttribute('value', arguments[1]);", el, text);
    }
}
