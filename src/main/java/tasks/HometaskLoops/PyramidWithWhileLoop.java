package tasks.HometaskLoops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PyramidWithWhileLoop {
    public static void main (String[] args) throws Exception{

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int number = Integer.parseInt (input.readLine());
        System.out.println("Enter X:");
        int a = Integer.parseInt (input.readLine());
        int b = 0;
        int i = 0, j =1;
        while(i<=number){
            while(j<=i){
                System.out.print(b + "\t");
                b = b + a;
                j++;
            }
            System.out.println(" ");
            i++;
            j=1;
        }
    }
}
