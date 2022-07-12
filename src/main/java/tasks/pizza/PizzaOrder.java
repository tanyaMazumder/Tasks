package tasks.pizza;

import java.util.ArrayList;

public class PizzaOrder {
    private double totalOrderCost;

    private final ArrayList<Pizza> pizzas;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void calculateTotalOrderCost() {
        final double STANDARD_BASE_COST = 199.99;
        final double SOFT_BASE_COST = 299.99;
        final double COST_PER_TOPPING = 20.5;

        for (Pizza pizza : pizzas) {
            switch (pizza.getPizzaBase()) {
                case "Standard":
                    totalOrderCost += STANDARD_BASE_COST;
                    break;
                case "Soft":
                    totalOrderCost += SOFT_BASE_COST;
                    break;
                case "Toppings":
                    totalOrderCost += COST_PER_TOPPING;
                    break;
                default:
                    totalOrderCost += 0.0;
                    break;
            }

            int totalToppings = pizza.getToppings().size();
            totalOrderCost += totalToppings * COST_PER_TOPPING;
        }
    }

    public double getTotalOrderCost() {
        return totalOrderCost;
    }

    public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            System.out.println("Ordered a " + pizza.getPizzaBase() + " pizza with " +    pizza.getToppings());
        }
        System.out.println("TOTAL ORDER AMOUNT: " + getTotalOrderCost());
    }
}
