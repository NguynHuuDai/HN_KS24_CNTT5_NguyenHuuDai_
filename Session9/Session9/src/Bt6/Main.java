package Bt6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle());

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Tong dien tich: " + totalArea);
    }
}