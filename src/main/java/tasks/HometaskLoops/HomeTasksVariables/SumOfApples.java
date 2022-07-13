package tasks.HometaskLoops.HomeTasksVariables;

import java.util.Scanner;

public class SumOfApples {

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        double x, y, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of apples Daniel has: ");
        x = sc.nextDouble();
        System.out.print("Enter the number of apples Amber has: ");
        y = sc.nextDouble();
        total = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + total);
    }
}