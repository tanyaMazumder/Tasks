package tasks.HometaskLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionSortingExample {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Tanya");
        employees.add("Afia");
        employees.add("Naushad");
        employees.add("Dilwar");

        System.out.println("List of employee names before sorting : ");
        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(employees);

        System.out.println("List of employee names after sorting :");
        it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
