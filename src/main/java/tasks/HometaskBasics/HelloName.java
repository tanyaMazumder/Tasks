package tasks.HometaskBasics;

import java.util.Scanner;

public class HelloName {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Hello, " +name);
    }
}