package tutorialsninja.demo.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        javascriptExecutor = (JavascriptExecutor) webDriver;
        PageFactory.initElements(webDriver, this);
    }
    /***
     * Set Text directly to 'value' attribute of an element (textbox, textarea, etc.)
     * @param el
     * @param text
     */
    protected void setText(WebElement el, String text){
        javascriptExecutor.executeScript("arguments[0].setAttribute('value', arguments[1]);", el, text);
    }
}

