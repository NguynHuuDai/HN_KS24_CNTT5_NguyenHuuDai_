package Bt3;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + baseSalary);
    }
}