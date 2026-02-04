package BTTH;

public class Main {
    public static void main(String[] args) {

        Employee e = new Teacher("Thay A", 8000000, "Java", 20);

        System.out.println("Luong Teacher: " + e.getSalary());
    }
}