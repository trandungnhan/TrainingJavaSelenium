package tutorialsninja.demo.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.demo.pages.NavigationBar;
import java.util.Arrays;
import java.util.List;

public class NavigationTests extends BaseTest{

    @Test
    public void navigationTestWithPredefinedElement(){
        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem("Desktops","PC");
    }

    @Test
    public void navigationTestWithMenuText1(){
        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem("Desktops","Show All Desktops");
    }

    @Test
    public void navigationTestWithMenuText3() {
        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuWithMouse("Desktops", "Show All Desktops");
    }

    @Test
    public void verifyMenuItems(){
        List<String> expectedMenuItems = Arrays.asList("Desktops", "Laptops & Notebooks", "Components", "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players");
        NavigationBar navigationBar = new NavigationBar(webDriver);
        List<String> actualMenuItems = navigationBar.getMenuItems();

        Assert.assertEquals(actualMenuItems, expectedMenuItems);
    }

    @Test
    public void verifySubMenuItems(){
        List<String> expectedMenuItems = Arrays.asList("Desktops", "Laptops & Notebooks", "Components", "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players");
        NavigationBar navigationBar = new NavigationBar(webDriver);

        for (String menuItem : expectedMenuItems){
            List<String> subMenuItems = navigationBar.getSubMenuItems(menuItem);
            System.out.println(subMenuItems.toString());
        }
    }
}
