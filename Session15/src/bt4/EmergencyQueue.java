package bt4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue;
    private Queue<EmergencyPatient> normalQueue;

    public EmergencyQueue() {
        emergencyQueue = new LinkedList<>();
        normalQueue = new LinkedList<>();
    }

    public void addPatient(EmergencyPatient p) {

        if (p.getPriority() == 1) {
            emergencyQueue.offer(p);
            System.out.println("Da them benh nhan cap cuu.");
        } else {
            normalQueue.offer(p);
            System.out.println("Da them benh nhan thong thuong.");
        }
    }

    public EmergencyPatient callNextPatient() {

        if (!emergencyQueue.isEmpty()) {
            EmergencyPatient p = emergencyQueue.poll();
            System.out.println("Dang kham (Cap cuu): " + p);
            return p;
        }

        if (!normalQueue.isEmpty()) {
            EmergencyPatient p = normalQueue.poll();
            System.out.println("Dang kham (Thong thuong): " + p);
            return p;
        }

        System.out.println("Khong con benh nhan.");
        return null;
    }

    public void displayQueue() {

        System.out.println("=== Danh sach cap cuu ===");
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p);
        }

        System.out.println("=== Danh sach thong thuong ===");
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p);
        }
    }
}
