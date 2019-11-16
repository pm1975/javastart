package old.petle2;

/**
 * Created by Piotr on 2019-10-09
 */
public class Hospital {
    private final int maxPatientsNumber = 10; //maksymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber]; //tablica na pacjentów
    private int regPatients = 0; //aktualna liczba pacjentów

    void addPatient(Patient patient) {
        if (regPatients < patients.length) {
            patients[regPatients++] = patient;
        } else {
            System.out.println("Zapisano maksymalną liczbę pacjentów: " + maxPatientsNumber);
        }
    }

    void printPatients() {
        System.out.println("Zapisanych pacjentów: " + regPatients);
        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() + " " +
                    patients[i].getPesel());
        }
    }
}
