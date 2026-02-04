package BTTH;

public class Teacher extends Employee {
    private String expertise;
    private int hours;

    public Teacher(String name, double baseSalary,
                   String expertise, int hours) {
        super(name, baseSalary);
        this.expertise = expertise;
        this.hours = hours;
    }

    @Override
    double getSalary() {
        return baseSalary + hours * 200000;
    }
}