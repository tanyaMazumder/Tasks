package tasks.pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaStore {
    public static void printWelcomeMessage() {
        System.out.println("------------------------------------");
        System.out.println("Welcome to the Pizza Order Program!");
        System.out.println("------------------------------------");
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        printWelcomeMessage();
        ArrayList<Pizza> pizzas = new ArrayList<>();
        System.out.println("Enter the total pizzas you would like to order: ");
        int totalPizzas = scanner.nextInt();
        for (int i = 0; i < totalPizzas; ++i) {
            Pizza pizza = new Pizza();
            ArrayList<String> toppings = new ArrayList<>();
            String pizzaBase;
            System.out.println("Enter the base of the Standard or Soft: ");
            pizzaBase = scanner.next();
            pizza.setPizzaBase(pizzaBase);
            int totalToppings;
            System.out.println("Enter the total amount of toppings on the pizza: ");
            totalToppings = scanner.nextInt();
            for (int j = 0; j < totalToppings; ++j) {
                System.out.println("Enter the topping: ");
                String topping = scanner.next();
                toppings.add(topping);
            }
            pizza.setToppings(toppings);
            pizzas.add(pizza);
        }
        PizzaOrder order = new PizzaOrder(pizzas);
        order.calculateTotalOrderCost();
        order.printOrderSummary();
        scanner.close();
    }
}
