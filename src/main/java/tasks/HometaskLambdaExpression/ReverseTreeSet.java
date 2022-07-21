package tasks.HometaskLambdaExpression;

import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args)
    {
        TreeSet<Object> numbers = new TreeSet<Object>();
        numbers.add(200);
        numbers.add(19);
        numbers.add(8);
        numbers.add(35);
        numbers.add(78);
        numbers.add(335);
        TreeSet<Object> intsReverse =
                (TreeSet<Object>)numbers.descendingSet();
        System.out.println("Without descendingSet(): " +
                numbers);
        System.out.println("With descendingSet(): " +
                intsReverse);
    }
}