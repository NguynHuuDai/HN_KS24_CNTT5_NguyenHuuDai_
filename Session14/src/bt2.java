import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {

        Map<String, String> drugs = new HashMap<>();

        drugs.put("T01", "Paracetamol");
        drugs.put("T02", "Ibuprofen");
        drugs.put("T03", "Aspirin");
        drugs.put("T04", "Amoxicillin");
        drugs.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma thuoc: ");
        String code = sc.nextLine();

        if (drugs.containsKey(code)) {
            System.out.println("Ten thuoc: " + drugs.get(code));
        } else {
            System.out.println("Thuoc khong ton tai.");
        }


    }
}