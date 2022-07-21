package tasks.HometasksPredicates;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Data
class ProductPredicate {
    String name, category, grade;
    int price;

    ProductPredicate(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }
}

@Data
class Response {
    String responseBody, responseType;
    int statusCode;

    Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
}

class BiggerThanThousand<E> implements Predicate<ProductPredicate> {

    @Override
    public boolean test(ProductPredicate v) {

        Integer thousand = 1000;

        return v.getPrice() > thousand ;
    }
}

class CategoryElectronics<E> implements Predicate<ProductPredicate> {

    @Override
    public boolean test(ProductPredicate v) {

        Integer thousand = 1000;

        return v.getPrice() > thousand ;
    }
}

public class QuestionOne {

    public static void main(String[] args){
        List<ProductPredicate> productList = new ArrayList<>();
        productList.add(new ProductPredicate("A", 5000, "Electronic", "First"));
        productList.add(new ProductPredicate("B", 2000, "Electronic", "First"));
        productList.add(new ProductPredicate("C", 500, "Kitchen", "Second"));
        productList.add(new ProductPredicate("D", 400, "Food", "Top"));
        productList.add(new ProductPredicate("E", 6000, "Clothing", "First"));
        productList.add(new ProductPredicate("F", 900, "Electronic", "First"));
        productList.add(new ProductPredicate("G", 1100, "Kitchen", "First"));
        productList.add(new ProductPredicate("H", 100, "Electronic", "Second"));
        productList.add(new ProductPredicate("I", 50, "Kitchen", "First"));
        productList.add(new ProductPredicate("J", 60, "Electronic", "First"));

        List<Response> responses = new ArrayList<>();
        responses.add(new Response("Get", 400, "JSON"));
        responses.add(new Response("Put", 401, "JSON"));
        responses.add(new Response("Post", 200, "JSON"));
        responses.add(new Response("Delete", 500, "SOAP"));
        responses.add(new Response("Patch", 404, "JSON"));
        responses.add(new Response("Options", 301, "SOAP"));


        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println(" Question 1-Check if the price of product is greater than 1000");
        BiggerThanThousand<ProductPredicate> btt = new BiggerThanThousand<>();
        productList.stream().filter(btt).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 2- Check if the product is of electronics category");
        Predicate<ProductPredicate> p1 = c -> c.getCategory() == "Electronic";
        productList.stream().filter(p1).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 3- Check if the products from the given list of product if the product price is greater than 100/- which are in electronics category");
        Predicate<ProductPredicate> p2 = c -> c.getCategory() == "Electronic" &&
                                         c.getPrice()  > 100;
        productList.stream().filter(p2).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 4- Check if the products from the given list of product if the product price is greaterthan 100/- or product is in electronics category");
        Predicate<ProductPredicate> p3 = c -> c.getCategory() == "Electronic" ||
                c.getPrice()  > 100;
        productList.stream().filter(p3).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 5- Check if the products from the given list of product if the product price is lessthan 100/- and product is in electronics category");
        Predicate<ProductPredicate> p4 = c -> c.getCategory() == "Electronic" &&
                c.getPrice()  < 100;
        productList.stream().filter(p4).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 6- check if the status code is 400. Print all the responses with status code 400 from the given list of responses.");
        Predicate<Response> p5 = c -> c.getStatusCode() == 400;
        responses.stream().filter(p5).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 7- check if the response type JSON. Print all the responses the response type JSON from the given list of responses.");
        Predicate<Response> p6 = c -> c.getResponseType().equals("JSON");
        responses.stream().filter(p6).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 8- check if the responses with status code 400 and response type JSON");
        Predicate<Response> p7 = c -> c.getResponseType().equals("JSON") &&
                                c.getStatusCode() ==400;
        responses.stream().filter(p7).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 9- check if the responses with status code 400 or response type JSON");
        Predicate<Response> p8 = c -> c.getResponseType().equals("JSON") ||
                c.getStatusCode() ==400;
        responses.stream().filter(p8).forEach(System.out::println);
        System.out.println("\n/******/******/******/******/******/******/******/******/******/******/******/******/");
        System.out.println("Question 10- the responses with status code is not 400 and response type JSON");
        Predicate<Response> p9 = c -> c.getResponseType().equals("JSON") &&
                c.getStatusCode() !=400;
        responses.stream().filter(p9).forEach(System.out::println);
    }

}
