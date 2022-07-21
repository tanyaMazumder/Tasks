package tasks.HometaskPremitiveInterfaces;

import java.util.function.IntConsumer;

public class SquareOfNumber {
    public static void main(String args[])
    {
        // Create a IntConsimer Instance
        IntConsumer display = a -> System.out.println(a*a);

        // Using accept() method
        display.accept(3);
    }
}
