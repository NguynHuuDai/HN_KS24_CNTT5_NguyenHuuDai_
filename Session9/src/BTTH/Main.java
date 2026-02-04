public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Anh A", 10000000, 5000000);
        Employee e2 = new Developer("Anh B", 8000000, 3);

        System.out.println("Luong Manager: " + e1.getSalary());
        System.out.println("Luong Developer: " + e2.getSalary());

        Developer dev = new Developer("Anh C", 9000000, 2);
        System.out.println("Luong Developer co thuong: " + dev.getSalary(3000000));
    }
}