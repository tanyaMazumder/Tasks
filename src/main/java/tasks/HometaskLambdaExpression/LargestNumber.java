package tasks.HometaskLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 30, 99, 1023, 98567, 056, 69, 7956, 2058);

        Optional<Integer> maxNumber = list.stream()
                .max((i, j) -> i.compareTo(j));

        System.out.println(maxNumber.get());
    }
}

