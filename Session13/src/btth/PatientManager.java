package btth;

import java.util.ArrayList;
import java.util.List;

public class PatientManager {

    private List<Patient> patients = new ArrayList<>();

    // 1. Thêm
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Thêm thành công!");
    }

    // 2. Xoá theo tên
    public void deletePatient(String name) {

        boolean found = false;

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getName().equalsIgnoreCase(name)) {
                patients.remove(i);
                found = true;
                System.out.println("Xoá thành công!");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // 3. Cập nhật tên
    public void updatePatient(String oldName, String newName) {

        boolean found = false;

        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(oldName)) {
                p.setName(newName);
                found = true;
                System.out.println("Cập nhật thành công!");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // 4. Tìm kiếm
    public void searchPatient(String name) {

        boolean found = false;

        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy: " + p.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }

    // 5. Hiển thị danh sách
    public void displayAll() {

        if (patients.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("Danh sách bệnh nhân:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}