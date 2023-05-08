package org.advancedPart.classes;

public class PublicClass { // file should have the same name
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass();
        InnerClass innerClass = new InnerClass();
        class LocalClass{ //class declared in method and with method scope

        }
        LocalClass localClass = new LocalClass(); // i can use this after declaring a class, not before

        //code block
       /* {
            int number = 10;
            System.out.println(number);
        }
        System.out.println(number);*/

        Product product = new Product("Milk");
//        ProductNotForSale product2 = new ProductNotForSale("Book shelve");
        product.show();
//        product2.show();

        Product product2 = new Product("Book shelve"){
            @Override
            public void show() {
                System.out.println("This is product with name " + name);
                System.out.println("Sorry, this product is not for sale :(");
            }
        };
        product2.show();
    }


    static class InnerClass{
        //every access type is possible
        //can be static or non-static
    }

}

class  Product{

    String name;

    public Product(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("This is product with name " + name);
        System.out.println("You can buy this product!");
    }


}


class PackageClass{ //there is only default access type possible

}

class PackageClass2 {
}



//public -> every package
//protected -> inherited classes in different packages
//default -> package scope
//private -> class scope