package btth;

import java.util.*;

public class HospitalManagement implements IManagement<Patient> {

    private Queue<Patient> queue;

    public HospitalManagement() {
        queue = new LinkedList<>();
    }

    @Override
    public void add(Patient p) {

        if (p instanceof EmergencyPatient) {
            LinkedList<Patient> temp = (LinkedList<Patient>) queue;
            temp.addFirst(p); // uu tien dua len dau
        } else {
            queue.offer(p);
        }

        System.out.println("Da dang ky kham.");
    }

    @Override
    public void display() {

        if (queue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return;
        }

        for (Patient p : queue) {
            p.showInfo();
        }
    }

    @Override
    public Patient search(String keyword) {

        for (Patient p : queue) {
            if (p.getId().equalsIgnoreCase(keyword) ||
                    p.getFullName().equalsIgnoreCase(keyword)) {
                return p;
            }
        }

        return null;
    }

    @Override
    public void sort() {

        List<Patient> list = new ArrayList<>(queue);

        Collections.sort(list, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        queue.clear();
        queue.addAll(list);

        System.out.println("Da sap xep theo tuoi.");
    }

    public Patient callPatient() {

        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan.");
            return null;
        }

        return queue.poll();
    }
}