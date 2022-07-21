package tasks.HometaskPremitiveInterfaces;

import java.util.function.IntSupplier;

public class RandomInteger {
    public static void main(String args[])
    {

        // Create a IntSupplier instance
        IntSupplier sup = () -> (int)(Math.random() * 5000);

        // Get the int value
        // Using getAsInt() method
        System.out.println(sup.getAsInt());
    }
}
