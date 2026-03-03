import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        // Thêm sản phẩm
        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Smartphone", 8000000, 12));
        repo.add(new FoodProduct("F01", "Milk", 50000, 10));
        repo.add(new FoodProduct("F02", "Bread", 20000, 5));

        System.out.println("Danh sách sản phẩm ");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("-------------------------");
        }

        System.out.println(" Tìm sản phẩm theo ID ");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }

       
    }
}
