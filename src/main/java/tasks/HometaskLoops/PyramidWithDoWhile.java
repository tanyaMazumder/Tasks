package tasks.HometaskLoops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PyramidWithDoWhile {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.println("Enter X:");
        int a =  scan.nextInt();
        int b = 0;
        System.out.print("\n");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(b + "\t");
                b = b + a;
                j++;
            } while (j <= i);
            System.out.print("\n");
            i++;
        } while (i <= rows);

    }
}

