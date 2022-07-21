package tasks.HometaskBifunctionInterfaces;

import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

@Data
class Product {
    String name, category, grade;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class BifunctionInterfaceExample {
    public static void main(String args[])
    {
        BiFunction<String, Integer, Product> func = (a, b)-> new Product(a,b);

        Product result = func.apply("Refrigerator",25000);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println(" Question 1 -Given the name and price of the product, write a Bifunction to create a product.");
        System.out.println(result);

        Map<Integer, Product> cart = new HashMap<>();
        cart.put(2,new Product("A",25));
        cart.put(3,new Product("B",250));
        cart.put(4,new Product("C",2500));
        cart.put(5,new Product("D",24));
        cart.put(9,new Product("E",240));
        cart.put(1,new Product("F",23));
        cart.put(6,new Product("G",230));

        BiFunction<Integer,Product,Integer> f2 = (key,value)-> (key * value.getPrice());
        Integer result2 = f2.apply(2,new Product("A",25));
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println(" Question 2 -Given the Product and quantity of the products, write a BiFunction to calculate the cost of products.\n" +
                " A cart is a map of product and quantity. Given the cart, calculate the cost of the cart. ");
        System.out.println(result2);

    }
}
