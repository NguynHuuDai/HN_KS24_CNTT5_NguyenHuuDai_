public class Developer extends Employee {
    private int projectCount;

    public Developer(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    @Override
    double getSalary() {
        return baseSalary + projectCount * 2000000;
    }

    // Overloading (tuỳ chọn)
    double getSalary(int bonus) {
        return getSalary() + bonus;
    }
}