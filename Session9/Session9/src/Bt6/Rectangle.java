package Bt6;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    // OVERLOADING
    public double area(double w, double h) {
        return w * h;
    }
}