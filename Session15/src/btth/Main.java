package btth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalManagement hm = new HospitalManagement();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Dang ky kham");
            System.out.println("2. Goi kham");
            System.out.println("3. Xem hang doi");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep theo tuoi");
            System.out.println("6. Xem lich su dieu tri");
            System.out.println("0. Thoat");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Condition: ");
                    String condition = sc.nextLine();

                    System.out.print("La cap cuu? (y/n): ");
                    String type = sc.nextLine();

                    if (type.equalsIgnoreCase("y")) {
                        hm.add(new EmergencyPatient(id, name, age, condition, 1));
                    } else {
                        hm.add(new Patient(id, name, age, condition));
                    }
                    break;

                case 2:
                    Patient p = hm.callPatient();
                    if (p != null) {
                        p.showInfo();
                        System.out.print("Nhap chan doan: ");
                        String record = sc.nextLine();
                        p.addHistory(record);
                    }
                    break;

                case 3:
                    hm.display();
                    break;

                case 4:
                    System.out.print("Nhap ID/Name: ");
                    String key = sc.nextLine();
                    Patient found = hm.search(key);
                    if (found != null) {
                        found.showInfo();
                    } else {
                        System.out.println("Khong tim thay.");
                    }
                    break;

                case 5:
                    hm.sort();
                    break;

                case 6:
                    System.out.print("Nhap ID: ");
                    String pid = sc.nextLine();
                    Patient pat = hm.search(pid);
                    if (pat != null) {
                        pat.showHistory();
                    } else {
                        System.out.println("Khong tim thay.");
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    return;
            }
        }
    }
}
