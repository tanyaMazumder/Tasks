package tasks.HometaskLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class SortEmployee {
    public static void main(String args[]) {
        ArrayList<Employee> el = new ArrayList<Employee>();
        el.add(new Employee("Tanya"));
        el.add(new Employee("Afia"));
        el.add(new Employee("Dilwar"));
        el.add(new Employee("Naushad"));
        Comparator<Employee> cm = Comparator.comparing(Employee::getName);
        Collections.sort(el, cm);
        System.out.println("Sorting by Name");
        for (Employee st : el) {
            System.out.println(st.name);
        }
    }
}
