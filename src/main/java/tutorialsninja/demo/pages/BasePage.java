package tutorialsninja.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    protected JavascriptExecutor javascriptExecutor;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        javascriptExecutor = (JavascriptExecutor) webDriver;
        // ExplicitWait with WebDriverWait
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(60));
        PageFactory.initElements(webDriver, this);
    }
    /***
     * Set Text directly to 'value' attribute of an element (textbox, textarea, etc.)
     * @param el
     * @param text
     */
    protected void inputText(WebElement el, String text){
        javascriptExecutor.executeScript("arguments[0].setAttribute('value', arguments[1]);", el, text);
    }

    protected void click(WebElement el){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(el)).click();
    }

    protected void click(By by){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    protected void click(By by, int waitTime) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    protected void inputText(By by, String text){
        WebElement el = webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        el.clear();
        el.sendKeys(text);
    }

    protected void inputKeys(WebElement el, String key){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(el));
        el.clear();
        el.sendKeys(key);
    }
}

