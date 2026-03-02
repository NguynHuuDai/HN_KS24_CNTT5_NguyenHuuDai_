package bt3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {

        for (int i = 0; i < actions.length; i++) {

            String action = actions[i];

            if (action.equals("PUSH")) {

                stack.push("Medication");
                System.out.println("PUSH -> Phat thuoc");

            } else if (action.equals("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Loi tai buoc " + (i + 1) +
                            ": POP khi chua co thuoc nao duoc phat.");
                    return false;
                }

                stack.pop();
                System.out.println("POP -> Hoan tat phat thuoc");

            } else {

                System.out.println("Loi tai buoc " + (i + 1) +
                        ": Hanh dong khong hop le.");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Loi: Con thuoc chua hoan tat khi ket thuc ca truc.");
            return false;
        }

        System.out.println("Quy trinh hop le.");
        return true;
    }

    public void reset() {
        stack.clear();
        System.out.println("Da reset he thong.");
    }
}
