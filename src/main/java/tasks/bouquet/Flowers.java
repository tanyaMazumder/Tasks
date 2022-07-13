package tasks.bouquet;

import java.util.ArrayList;

public class Flowers {
    private String flowerName;
    private int qty;
    private double price;
    private double totalPrice;

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    Flowers(String flowerName, int qty, double price, double totalPrice){
        this.flowerName =flowerName;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;

    }

    //displayFormat
    public static void displayFormat()
    {
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
    }

    // display
    public void display()
    {
        System.out.format("   %-9s      %5d               %9.2f                       %14.2f\n" ,flowerName, qty, price, totalPrice);
    }


}