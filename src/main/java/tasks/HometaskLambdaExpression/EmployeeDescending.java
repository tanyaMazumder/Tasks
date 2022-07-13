package tasks.HometaskLambdaExpression;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeDescending {
    public static void main(String[] args) {
        SortedSet<String> Employee = new TreeSet<>(Comparator.reverseOrder());
        Employee.add("Tanya");
        Employee.add("Afia");
        Employee.add("Naushad");
        Employee.add("Dilwar");
        System.out.println("Employee Set as follows " + Employee);
    }
}
