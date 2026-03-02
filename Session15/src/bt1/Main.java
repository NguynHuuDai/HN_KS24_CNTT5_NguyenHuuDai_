package bt1;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Sua ten benh nhan", "10:00"));
        history.addEdit(new EditAction("Cap nhat chan doan", "10:15"));
        history.addEdit(new EditAction("Them don thuoc", "10:30"));

        history.displayHistory();

        System.out.println("Chinh sua gan nhat: " + history.getLatestEdit());

        history.undoEdit();

        history.displayHistory();
    }
}