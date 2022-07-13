//package tasks.bouquet;
//
//import tasks.pizza.PizzaOrder;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class BouquetPrice {
//
//    abstract class BouquetDescription
//    {
//
//
//    public static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);
//        HashMap<String, Integer> map = new HashMap<>();
//        System.out.println("Enter the total number of flowers to be added to Bouquet that you will like to order: ");
//        int totalFlowers = scanner.nextInt();
//        Flowers flowers = new Flowers();
//        System.out.println("Enter the number of roses: ");
//        int roses = Integer.parseInt(scanner.next());
//        map.put("Rose", roses);
//        System.out.println("Enter the number of jasmines: ");
//        int jasmine = Integer.parseInt(scanner.next());
//        map.put("Jasmine", jasmine);
//        System.out.println("Enter the number of lilies: ");
//        int lily = Integer.parseInt(scanner.next());
//        map.put("Lily", lily);
//        int sum = roses + jasmine + lily;
//        if(sum == totalFlowers){
////            FlowersOrder order = new FlowersOrder(pizzas);
////            order.calculateTotalOrderCost();
////            order.printOrderSummary();
//            scanner.close();
//        } else {
//            System.out.println("Total number of flowers are not matching");
//        }
//    }
//    }
//}
