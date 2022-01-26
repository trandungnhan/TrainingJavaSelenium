package tutorialsninja.demo.tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import tutorialsninja.demo.dto.Product;
import org.testng.annotations.Test;
import tutorialsninja.demo.pages.NavigationBar;
import tutorialsninja.demo.pages.ProductComponent;
import tutorialsninja.demo.pages.ProductPage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProductTests extends BaseTest {

    @Test
    public void productTests() {
        String productType = "Desktops";
        String subProductType = "Show All Desktops";
        String productName = "Canon EOS 5D";

        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem(productType, subProductType);

        ProductComponent productComponent = new ProductComponent(webDriver, productName);

        System.out.println(productComponent.getImage());
        System.out.println(productComponent.getProductName());
        System.out.println(productComponent.getProductDescription());
        System.out.println(productComponent.getNewPrice());
        System.out.println(productComponent.getOldPrice());
        System.out.println(productComponent.getTax());

        Product product = productComponent.getProduct();
        System.out.println(product.toString());
    }

    @Test
    public void allPredefinedProductsTest() {
        String productType = "Desktops";
        String subProductType = "Show All Desktops";
        List<String> productNames = Arrays.asList("Apple Cinema 30\"", "Canon EOS 5D", "HP LP3065");

        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem(productType, subProductType);
        for (String name : productNames){
            ProductComponent productComponent = new ProductComponent(webDriver, name);
            Product product = productComponent.getProduct();
            System.out.println(product.toString());
            System.out.println("---------------");
        }
    }

    @Test
    public void getAllProductsTest(){
        String productType = "Desktops";
        String subProductType = "Show All Desktops";

        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem(productType, subProductType);

        ProductPage productPage = new ProductPage(webDriver);
        List<Product> products = productPage.getAllProducts();
        for (Product product : products){
            System.out.println(product.toString());
        }

    }
    @Test
    public void verifyDisplayProducts() throws IOException {
        File file = new File("src/main/resources/data/Product.json");
        ObjectMapper objectMapper = new ObjectMapper();

        // expected result get from external json file
        List<Product> expectedProducts = objectMapper.readValue(file, new TypeReference<List<Product>>() {
        });

        // actual result get from website
        String productType = "Desktops";
        String subProductType = "Show All Desktops";

        NavigationBar navigationBar = new NavigationBar(webDriver);
        navigationBar.openMenuItem(productType, subProductType);

        ProductPage productPage = new ProductPage(webDriver);
        List<Product> actualProducts = productPage.getAllProducts();

        System.out.println("==== Expected Products ====");
        for (Product product : expectedProducts){
            System.out.println(product.toString());
        }

        System.out.println("==== Actual Products ====");
        for (Product product : actualProducts){
            System.out.println(product.toString());
        }

        //Verify actual result
        Assert.assertTrue(actualProducts.containsAll(expectedProducts));
    }

}
