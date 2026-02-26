package btth;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        PatientManager patientManager = new PatientManager();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("""
                    
                    ====== PATIENT MANAGEMENT ======
                    1. Thêm mới
                    2. Xoá
                    3. Cập nhật
                    4. Tìm kiếm
                    5. Sắp xếp theo tuổi
                    6. Sắp xếp theo tên
                    7. Hiển thị danh sách
                    8. Thoát
                    Lựa chọn của bạn:
                    """);

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    Patient patient = new Patient();

                    System.out.print("Nhập ID: ");
                    patient.setId(sc.nextLine());

                    System.out.print("Nhập tên: ");
                    patient.setName(sc.nextLine());

                    System.out.print("Nhập tuổi: ");
                    patient.setAge(Integer.parseInt(sc.nextLine()));

                    patientManager.addPatient(patient);
                    break;

                case 2:
                    System.out.print("Nhập ID cần xoá: ");
                    String deleteId = sc.nextLine();
                    patientManager.deletePatient(deleteId);
                    break;

                case 3:
                    System.out.print("Nhập ID cần cập nhật: ");
                    String updateId = sc.nextLine();

                    Patient newPatient = new Patient();
                    newPatient.setId(updateId);

                    System.out.print("Nhập tên mới: ");
                    newPatient.setName(sc.nextLine());

                    System.out.print("Nhập tuổi mới: ");
                    newPatient.setAge(Integer.parseInt(sc.nextLine()));

                    patientManager.updatePatient(updateId, newPatient);
                    break;

                case 4:
                    System.out.print("Nhập từ khoá tìm kiếm: ");
                    String keyword = sc.nextLine();
                    patientManager.searchPatient(keyword);
                    break;

                case 5:
                    patientManager.sortByAge();
                    System.out.println("Đã sắp xếp theo tuổi.");
                    break;

                case 6:
                    patientManager.sortByName();
                    System.out.println("Đã sắp xếp theo tên.");
                    break;

                case 7:
                    patientManager.displayAll();
                    break;

                case 8:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 8);

        sc.close();
    }
}