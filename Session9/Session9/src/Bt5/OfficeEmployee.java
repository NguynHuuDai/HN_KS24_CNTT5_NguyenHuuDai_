package Bt5;

public class OfficeEmployee extends Employee {
    private double monthlySalary;

    public OfficeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}