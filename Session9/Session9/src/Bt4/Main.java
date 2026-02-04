package Bt4;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog(); // đa hình

        animal.sound();


        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
        }
    }
}