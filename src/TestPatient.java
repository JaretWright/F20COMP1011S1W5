import java.time.LocalDate;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient = new Patient("Barney","Rubble","7055551234","14 HappyVale Dr.",
                            "Stroud","ON", LocalDate.of(2000,12,14));

        System.out.printf("%s %s is patient ID: %d",patient.getFirstName(), patient.getLastName(),
                patient.getId());
    }
}
