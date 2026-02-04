package Bt5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee(10000000));
        employees.add(new ProductionEmployee(300, 20000));
        employees.add(new OfficeEmployee(12000000));

        double totalSalary = 0;

        for (Employee e : employees) {
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tong luong: " + totalSalary);
    }
}
