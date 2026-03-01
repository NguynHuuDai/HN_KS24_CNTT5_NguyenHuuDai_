package btth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PatientService service = new PatientService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= QUAN LY PHONG KHAM =========");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Cap nhat benh nhan");
            System.out.println("3. Xoa benh nhan");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Them ho so kham");
            System.out.println("6. Xem ho so");
            System.out.println("7. Xoa ho so");
            System.out.println("8. Tim benh nhan theo ten");
            System.out.println("9. Sap xep theo tuoi");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Ten: ");
                    String name = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("SDT: ");
                    String phone = sc.nextLine();
                    service.add(new Patient(id, name, age, phone));
                    break;
                case 2:
                    System.out.print("Nhap ID can cap nhat: ");
                    service.update(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Nhap ID can xoa: ");
                    service.delete(sc.nextLine());
                    break;
                case 4:
                    service.displayAll();
                    break;
                case 5:
                    System.out.print("Nhap ID benh nhan: ");
                    service.addRecord(sc.nextLine());
                    break;
                case 6:
                    System.out.print("Nhap ID benh nhan: ");
                    service.viewRecords(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Nhap ID benh nhan: ");
                    String pid = sc.nextLine();
                    System.out.print("Nhap ma ho so: ");
                    service.deleteRecord(pid, sc.nextLine());
                    break;
                case 8:
                    System.out.print("Nhap ten can tim: ");
                    service.searchByName(sc.nextLine());
                    break;
                case 9:
                    service.sortByAge();
                    break;
            }

        } while (choice != 0);
    }
}
