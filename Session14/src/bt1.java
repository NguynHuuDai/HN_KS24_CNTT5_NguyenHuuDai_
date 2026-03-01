import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class bt1 {

    public static void main(String[] args) {

        Set<String> patients = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== DANH SACH BENH NHAN =====");
            System.out.println("1. Nhap ten benh nhan");
            System.out.println("2. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Nhap ten benh nhan: ");
                String name = sc.nextLine();

                if (patients.add(name)) {
                    System.out.println("Da them thanh cong.");
                } else {
                    System.out.println("Ten da ton tai, khong them lai.");
                }

            } else if (choice == 2) {
                System.out.println("\nDanh sach benh nhan cho kham:");
                for (String p : patients) {
                    System.out.println(p);
                }
            }

        } while (choice != 0);


    }
}