package btth;

import java.util.Stack;

public class Patient extends Person {

    protected String medicalCondition;
    protected Stack<String> history;

    public Patient(String id, String fullName, int age, String medicalCondition) {
        super(id, fullName, age);
        this.medicalCondition = medicalCondition;
        this.history = new Stack<>();
    }

    public void addHistory(String record) {
        history.push(record);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("Khong co lich su dieu tri.");
            return;
        }

        System.out.println("=== Lich su dieu tri (Gan nhat truoc) ===");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + id +
                " | Name: " + fullName +
                " | Age: " + age +
                " | Condition: " + medicalCondition);
    }
}