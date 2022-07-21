package tasks.HometaskLambdaExpression;

import java.util.SortedSet;
import java.util.TreeSet;


//The TreeSet stores the objects in the ascending order, which is a natural ordering of a tree.
// We can also specify a comparator to sort the elements based on it during the creation of the TreeSet.
// It implements the SortedSet and NavigableSet interface to maintain and navigate the order of the elements.
public class EmployeeTreeset {
    public static void main(String[] args) {
        SortedSet<String> Employee = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Employee.add("Tanya");
        Employee.add("Afia");
        Employee.add("Naushad");
        Employee.add("Dilwar");
        System.out.println("Employee Set as follows" + Employee);
    }
}