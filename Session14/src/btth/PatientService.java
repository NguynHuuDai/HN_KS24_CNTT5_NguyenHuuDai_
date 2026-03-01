package btth;

import java.util.*;

public class PatientService {

    private Set<Patient> patients = new HashSet<>();
    private Map<String, List<MedicalRecord>> recordMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);


    public void add(Patient p) {
        for (Patient patient : patients) {
            if (patient.getId().equalsIgnoreCase(p.getId())) {
                System.out.println("ID da ton tai!");
                return;
            }
        }
        patients.add(p);
        System.out.println("Them thanh cong.");
    }


    public void update(String id) {
        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhap ten moi: ");
                p.setName(sc.nextLine());
                System.out.print("Nhap tuoi moi: ");
                p.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhap sdt moi: ");
                p.setPhone(sc.nextLine());
                System.out.println("Cap nhat thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay benh nhan.");
    }

    public void delete(String id) {
        Patient removePatient = null;
        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                removePatient = p;
                break;
            }
        }
        if (removePatient != null) {
            patients.remove(removePatient);
            recordMap.remove(id);
            System.out.println("Xoa thanh cong.");
        } else {
            System.out.println("Khong tim thay.");
        }
    }

    public void displayAll() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    public void addRecord(String patientId) {
        if (!recordMap.containsKey(patientId)) {
            recordMap.put(patientId, new ArrayList<>());
        }

        System.out.print("Nhap ma ho so: ");
        String recordId = sc.nextLine();
        System.out.print("Nhap chan doan: ");
        String diagnosis = sc.nextLine();
        System.out.print("Nhap ngay kham: ");
        String date = sc.nextLine();

        recordMap.get(patientId).add(new MedicalRecord(recordId, diagnosis, date));
        System.out.println("Them ho so thanh cong.");
    }

    public void viewRecords(String patientId) {
        List<MedicalRecord> list = recordMap.get(patientId);
        if (list == null || list.isEmpty()) {
            System.out.println("Khong co ho so.");
            return;
        }
        for (MedicalRecord r : list) {
            System.out.println(r);
        }
    }

    public void deleteRecord(String patientId, String recordId) {
        List<MedicalRecord> list = recordMap.get(patientId);
        if (list != null) {
            list.removeIf(r -> r.getRecordId().equalsIgnoreCase(recordId));
            System.out.println("Da xoa ho so.");
        }
    }

    public void searchByName(String keyword) {
        for (Patient p : patients) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                p.displayInfo();
            }
        }
    }

    public void sortByAge() {
        List<Patient> list = new ArrayList<>(patients);
        list.sort(Comparator.comparingInt(Patient::getAge));
        for (Patient p : list) {
            p.displayInfo();
        }
    }

    public void sortById() {
        List<Patient> list = new ArrayList<>(patients);
        list.sort(Comparator.comparing(Patient::getId));
        for (Patient p : list) {
            p.displayInfo();
        }
    }
}