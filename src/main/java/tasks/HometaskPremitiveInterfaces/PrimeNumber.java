package tasks.HometaskPremitiveInterfaces;

import java.util.function.IntPredicate;

public class PrimeNumber {
    public static void main(String[] args) {
        IntPredicate intPredicate = (x) ->
        {
            if (x <= 1)
                return false;
            else if (x == 2)
                return true;
            else if (x % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(x); i += 2) {
                if (x % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println("Is the number prime :" + intPredicate.test(13));
    }
}
