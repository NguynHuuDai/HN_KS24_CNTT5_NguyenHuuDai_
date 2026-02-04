public class Teacher extends Employee {
    private String expertise;
    private int hours;

    public Teacher(String name, double baseSalary,
                   String expertise, int hours) {
        super(name, baseSalary); // BẮT BUỘC
        this.expertise = expertise;
        this.hours = hours;
    }
}