package bt2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // enqueue
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Da them benh nhan vao hang doi.");
    }

    // dequeue
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan nao trong hang doi.");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    // peek
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan trong hang doi.");
            return;
        }

        System.out.println("Danh sach benh nhan (tu dau den cuoi):");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}