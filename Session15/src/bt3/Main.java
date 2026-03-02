package bt3;

public class Main {

    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(actions1);

        System.out.println("------------------");

        checker.reset();

        String[] actions2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(actions2);
    }
}
