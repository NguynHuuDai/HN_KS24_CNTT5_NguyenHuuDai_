package Bt6;

public class Circle extends Shape {
    private double radius;

    // Constructor 1
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor 2 (OVERLOADING)
    public Circle() {
        this.radius = 1.0;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}