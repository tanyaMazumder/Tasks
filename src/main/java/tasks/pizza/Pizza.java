package tasks.pizza;

import java.util.ArrayList;

public class Pizza {

    private String pizzaBase;
    private ArrayList<String> toppings;

    public String getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(String pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String toString() {
        return this.pizzaBase + " pizza with " + this.getToppings();
    }
}
