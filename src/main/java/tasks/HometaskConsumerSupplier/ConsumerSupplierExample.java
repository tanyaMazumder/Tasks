package tasks.HometaskConsumerSupplier;

import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Data
class Product {
    String name, category, grade, printParameter;
    int price;

    Product(String name, int price, String category, String grade, String printParameter) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
        this.printParameter = printParameter;
    }
}

public class ConsumerSupplierExample {
    public static void main(String args[]) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 5000, "Electronic", "First", "File"));
        productList.add(new Product("B", 2000, "Electronic", "First", "Console"));
        productList.add(new Product("C", 500, "Kitchen", "Second", "CSV"));
        productList.add(new Product("D", 400, "Food", "Top", "Excel"));
        productList.add(new Product("E", 6000, "Clothing", "First", "File"));
        productList.add(new Product("F", 900, "Electronic", "First", "File"));
        productList.add(new Product("G", 1100, "Kitchen", "First", "CSV"));
        productList.add(new Product("H", 100, "Electronic", "Second", "CSV"));
        productList.add(new Product("I", 50, "Kitchen", "First", "File"));
        productList.add(new Product("J", 60, "Electronic", "First", "File"));

        Consumer<List<Product>> printParameter = MyProduct::printParameter;

        Consumer<List<Product>> printPremiumConsumer = MyProduct::printPremium;

        Consumer<List<Product>> printSuffixedConsumer = MyProduct::printSuffixed;

        Consumer<List<Product>> printNameSuffixedWithPremiumGrade = MyProduct::printNameSuffixedWithPremiumGrade;

        printParameter.andThen(printPremiumConsumer).andThen(printSuffixedConsumer).andThen(printNameSuffixedWithPremiumGrade).accept(productList);
    }

    class MyProduct {

        static void printParameter(List<Product> productList) {
            System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
            System.out.println(" Question 1 -consumer to print the product to appropriate medium depending on the print parameter. If the print parameter is set to file, consumer shall log the product to file, if not print on the console.");
            List<Product> productListWithFile = new ArrayList<>();
            productList.forEach(n -> {
                if (n.getPrintParameter().equals("File")) {
                    productListWithFile.add(n);
                } else {
                    System.out.println(n);
                }
            });
            try {
                if (productListWithFile.size() != 0) {
                    FileWriter writer = new FileWriter("output.txt");
                    for (Product str : productListWithFile) {
                        writer.write(str + System.lineSeparator());
                    }
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        static void printPremium(List<Product> productList) {
            System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
            System.out.println(" Question 2 -Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. Given the product list, update the grade for each product and print all of the products. ");

            productList.forEach(n -> {
                if (n.getPrice() > 1000) {
                    n.setGrade("Premium");
                }
            });
            productList.stream().forEach(System.out::println);
        }

        static void printSuffixed(List<Product> productList) {
            System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
            System.out.println(" Question 3 -Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. Given the product list, update the grade for each product and print all of the products. ");
            productList.forEach(n -> {
                if (n.getPrice() > 3000) {
                    n.setName(n.getName() + "*");
                }
            });
            productList.stream().forEach(System.out::println);
        }

        static void printNameSuffixedWithPremiumGrade(List<Product> productList) {
            System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
            System.out.println(" Question 4 -Print all the Premium grade products with name suffixed with '*'.");
            productList.forEach(n -> {
                if (n.getGrade().equals("Premium")) {
                    n.setName(n.getName() + "*");
                }
            });
            productList.stream().forEach(System.out::println);
        }
    }
}