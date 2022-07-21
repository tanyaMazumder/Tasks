package tasks.HometaskStreams;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.*;

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

//A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
public class StreamsExample {
    public static void main(String args[]) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A", 5000, "Electronic", "First"));
        productList.add(new Product("B", 2000, "Electronic", "First"));
        productList.add(new Product("C", 500, "Kitchen", "Second"));
        productList.add(new Product("D", 400, "Food", "Top"));
        productList.add(new Product("E", 6000, "Clothing", "First"));
        productList.add(new Product("F", 900, "Electronic", "First"));
        productList.add(new Product("G", 1100, "Kitchen", "First"));

        List<Product> result = productList.stream().filter(s->s.price>1000).collect(Collectors.toList());
        System.out.println(result);

        List<Product> result1 = productList.stream().filter(s->s.category=="Electronic").collect(Collectors.toList());
        System.out.println(result1);

        //TODO
        List<Product> result2 = productList.stream().filter(s->s.category=="Electronic"&&s.price>1000).collect(Collectors.toList());
        System.out.println(result2);

        long result3 = productList.stream().filter(s->s.category=="Electronic").count();
        System.out.println(result3);

    }
}
