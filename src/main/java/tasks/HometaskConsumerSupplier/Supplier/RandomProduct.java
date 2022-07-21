package tasks.HometaskConsumerSupplier.Supplier;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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
public class RandomProduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 5000, "Electronic", "First"));
        productList.add(new Product("B", 2000, "Electronic", "First"));
        productList.add(new Product("C", 500, "Kitchen", "Second"));
        productList.add(new Product("D", 400, "Food", "Top"));
        productList.add(new Product("E", 6000, "Clothing", "First"));
        productList.add(new Product("F", 900, "Electronic", "First"));
        productList.add(new Product("G", 1100, "Kitchen", "First"));
        productList.add(new Product("H", 100, "Electronic", "Second"));
        productList.add(new Product("I", 50, "Kitchen", "First"));
        productList.add(new Product("J", 60, "Electronic", "First"));
        Supplier<Product> s = () -> {
            int x = (int) (Math.random() * productList.size());
            return productList.get(x);
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
