package tutorialsninja.demo.pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NavigationBar extends BasePage {

    @FindBy(linkText = "Desktops")
    private WebElement lkDesktops;

    @FindBy(xpath = "//li[contains(@class, 'dropdown')][.//a[.='Desktops']]//a[contains(., 'PC')]")
    private WebElement lkDesktopsPC;

    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement lkLaptopsNoteBooks;

    @FindBy(linkText = "Components")
    private WebElement lkComponents;

    @FindBy(linkText = "Tablets")
    private WebElement lkTablets;

    @FindBy(linkText = "Software")
    private WebElement lkSoftware;

    @FindBy(linkText = "Phone & PDAs")
    private WebElement lkPhonePDAs;

    @FindBy(linkText = "Cameras")
    private WebElement lkCameras;

    @FindBy(linkText = "MP3 Players")
    private WebElement lkMP3Players;

    public NavigationBar(WebDriver webDriver){super(webDriver);}

    public void openDesktopsPC(){
        lkDesktops.click();
        lkDesktopsPC.click();
    }

    public void openMenuItem(String mainItem, String subItem) {
        By byMainItem = By.linkText(mainItem);
        By bySubItem = By.xpath(String.format("//li[contains(@class, 'dropdown')][.//a[.='%s']]//a[contains(., '%s')]", mainItem, subItem));

        webDriver.findElement(byMainItem).click();
        webDriver.findElement(bySubItem).click();
    }

    public void openMenuWithMouse(String mainItem, String subItem){
        Actions actions = new Actions(webDriver);

        By byMainItem = By.linkText(mainItem);
        By bySubItem = By.xpath(String.format("//li[contains(@class, 'dropdown')][.//a[.='%s']]//a[contains(., '%s')]", mainItem, subItem));

        WebElement lkMainItem = webDriver.findElement(byMainItem);
        actions.moveToElement(lkMainItem);

        WebElement lkSubItem = webDriver.findElement(bySubItem);
        actions.moveToElement(lkSubItem);

        actions.click();
        actions.build().perform();
    }

    public List<String> getMenuItems(){
        By byMenuItems = By.xpath("//ul[@class = 'nav navbar-nav']/li/a");
        List<WebElement> lkMenuItems = webDriver.findElements(byMenuItems);
        List<String> menuItems = new ArrayList<>();
        for(WebElement el : lkMenuItems){
            menuItems.add(el.getText());
        }

        return menuItems;
    }

    public List<String> getSubMenuItems(String mainItem){
        By byMainItem = By.linkText(mainItem);
        By bySubMenuItems = By.xpath(String.format("//li[contains(@class, 'dropdown')][.//a[.='%s']]//div[@class='dropdown-menu']//a", mainItem));

        Actions actions = new Actions(webDriver);
        WebElement lkMainItem = webDriver.findElement(byMainItem);
        actions.moveToElement(lkMainItem).build().perform();

        List<WebElement> lkSubMenuItems = webDriver.findElements(bySubMenuItems);
        List<String> subMenuItems = new ArrayList<>();
        for (WebElement el : lkSubMenuItems){
            subMenuItems.add(el.getText());
        }

        return subMenuItems;
    }

}
