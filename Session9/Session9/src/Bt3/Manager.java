package Bt3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // dùng lại của lớp cha
        System.out.println("Phong ban: " + department);
    }
}