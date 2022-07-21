package tasks.HometaskConstructorReference;

import lombok.Data;

@Data
class Employee {
    String name, account;
    int salary;

    Employee() {
        System.out.println("Empty Constructor");
    }

    Employee(String name, String account, int salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
}

interface EmployeeEmpty {
    Employee get();
}

interface EmployeeWithName {
    Employee get(String name, String account, int salary);
}

public class ConstructorReferenceExample {
    public static void main(String args[]) {
        EmployeeEmpty empEmpty = Employee::new;
        System.out.println(empEmpty.get());

        Employee employee = new Employee("A", "XYZ", 10000);
        System.out.println(employee);

        EmployeeWithName empWithName = Employee::new;
        System.out.println(empWithName.get("B", "DEF", 15000));
    }
}
