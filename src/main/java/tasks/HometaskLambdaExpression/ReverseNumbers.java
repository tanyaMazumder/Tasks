package tasks.HometaskLambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseNumbers {
    public static void main(String... args)
    {
        List<Integer> values
                = Arrays.asList(313, 235,
                324, 677,
                33, 99,
                2332);
        values.sort(Comparator.reverseOrder());
        System.out.println(values);
    }
}
