package bt1;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Da them chinh sua vao lich su.");
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Khong co chinh sua nao de undo.");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Da undo: " + removed);
        return removed;
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack rong.");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Khong co lich su chinh sua.");
            return;
        }

        System.out.println("Danh sach chinh sua (tu moi nhat den cu nhat):");

        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}