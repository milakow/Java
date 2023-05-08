package org.advancedPart.classes;

public class ProductNotForSale extends Product {
    public ProductNotForSale(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("This is product with name " + name);
        System.out.println("Sorry, this product is not for sale :(");
    }
}
