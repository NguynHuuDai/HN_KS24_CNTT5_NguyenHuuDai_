package bt2;

public class Main {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "An", 25));
        pq.addPatient(new Patient("P02", "Binh", 30));
        pq.addPatient(new Patient("P03", "Chi", 22));

        pq.displayQueue();

        System.out.println("Benh nhan tiep theo: " + pq.peekNextPatient());

        pq.callNextPatient();

        pq.displayQueue();
    }
}