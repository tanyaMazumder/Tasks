package tasks.HometaskFunctionInterface;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Product {
    String name, category, grade;
    int price;

    Product(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }
}

//    An Interface that contains exactly one abstract method is known as functional interface.
//    It can have any number of default, static methods but can contain only one abstract method.
//    It can also declare methods of object class.
@FunctionalInterface
interface CalculatePrice {
    int calculateAllPrice(List<Product> p);
}

public class FunctionInterfaceExample {
    public static void main(String args[]) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 5000, "Electronic", "First"));
        productList.add(new Product("B", 2000, "Electronic", "First"));
        productList.add(new Product("C", 500, "Kitchen", "Second"));
        productList.add(new Product("D", 400, "Food", "Top"));
        productList.add(new Product("E", 6000, "Clothing", "First"));
        productList.add(new Product("F", 900, "Electronic", "First"));
        productList.add(new Product("G", 1100, "Kitchen", "First"));

        CalculatePrice cp = (List<Product> pro)-> pro.stream().filter(c->c.price>0).mapToInt(c->c.getPrice()).sum();
        int sum = cp.calculateAllPrice(productList);
        System.out.println("Sum Price of all products: "+ sum);

        CalculatePrice cp1 = (List<Product> pro)-> pro.stream().filter(c->c.price>1000).mapToInt(c->c.getPrice()).sum();
        int sumGreaterThanThousand = cp1.calculateAllPrice(productList);
        System.out.println("Sum Price of all products greater than 1000: "+ sumGreaterThanThousand);

        CalculatePrice cp2 = (List<Product> pro)-> pro.stream().filter(c->c.category=="Electronic").mapToInt(c->c.getPrice()).sum();
        int sumElectronicCategory = cp2.calculateAllPrice(productList);
        System.out.println("Sum Price of all products in Electronics Category: "+ sumElectronicCategory);

        CalculatePrice cp3 = (List<Product> pro)-> pro.stream().filter(c->c.category=="Electronic"&&c.price>1000).mapToInt(c->c.getPrice()).sum();
        int sumElectronicGreaterThousand = cp3.calculateAllPrice(productList);
        System.out.println("Sum Price of all products in Electronics Category and greater than 1000: "+ sumElectronicGreaterThousand);
    }
}