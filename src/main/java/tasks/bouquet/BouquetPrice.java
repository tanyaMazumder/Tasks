package tasks.bouquet;

import tasks.pizza.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class BouquetPrice {

    abstract class BouquetDescription
    {


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Flowers> flowersList = new ArrayList<>();
        System.out.println("Enter the total number of flowers to be added to Bouquet that you will like to order: ");
        int totalFlowers = scanner.nextInt();
        for (int i = 0; i < totalFlowers; ++i) {
            Flowers flowers = new Flowers();
        }
    }
    }
}
