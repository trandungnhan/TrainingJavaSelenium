package tutorialsninja.demo.dto;

import java.util.Objects;

public class Product {

    String image;
    String name;
    String description;
    String price;
    String newPrice;
    String oldPrice;
    String tax;

    public Product(){}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", newPrice='" + newPrice + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return
 //               Objects.equals(image, product.image)
                Objects.equals(name, product.name)
 //               && Objects.equals(description, product.description)
                && Objects.equals(price, product.price)
                && Objects.equals(newPrice, product.newPrice)
                && Objects.equals(oldPrice, product.oldPrice)
                && Objects.equals(tax, product.tax);
    }

}
