package tasks.HometaskLoops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PyramidForLoop {
    public static void main (String[] args) throws Exception{

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int number = Integer.parseInt (input.readLine());
        System.out.println("Enter X:");
        int a = Integer.parseInt (input.readLine());
        int b = 0;
        for(int i=0; i<= number ;i++){
            for(int j=1; j <= i ; j++){
                System.out.print(b + "\t");
                b = b + a;
            }
            System.out.println("");
        }
    }
}
