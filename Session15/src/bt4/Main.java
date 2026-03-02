package bt4;

public class Main {

    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("E01", "An", 2));
        queue.addPatient(new EmergencyPatient("E02", "Binh", 1));
        queue.addPatient(new EmergencyPatient("E03", "Chi", 2));
        queue.addPatient(new EmergencyPatient("E04", "Dung", 1));

        queue.displayQueue();

        System.out.println("------ Goi kham ------");

        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
    }
}
