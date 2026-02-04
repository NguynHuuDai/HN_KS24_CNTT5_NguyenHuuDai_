package Bt1;

public class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Ho ten: " + fullName);
        System.out.println("Tuoi: " + age);
    }
}
