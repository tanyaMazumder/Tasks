package tasks.bouquet;

import tasks.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowersOrder {

    public static void main(String args[]){
        String flowerName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName =scan.nextLine();
        List<Flowers> product = new ArrayList<Flowers>();
        do
        {
            System.out.println("Enter the product details: ");
            System.out.print("Product Name: ");
            flowerName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per unit): ");
            price = scan.nextDouble();
            totalPrice = price * quantity;
            overAllPrice = overAllPrice + totalPrice;
            product.add( new Flowers(flowerName, quantity, price, totalPrice) );
            System.out.print("Want to add more flowers? (y or n): ");
            choice = scan.next().charAt(0);
            scan.nextLine();
        }
        while (choice == 'y' || choice == 'Y');
        Flowers.displayFormat();
        for (Flowers p : product)
        {
            p.display();
        }
        //price calculation
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);
        scan.close();
    }
}
