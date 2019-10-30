package polimorfizm_moja_proba;

/**
 * Created by Piotr on 2019-10-29
 */
public class Hospital {
    private final static int PERSONS = 3;
    private Person[] people = new Person[PERSONS];
    private int lastPerson = 0;

    public void add(Person person) {
        if (lastPerson < PERSONS) {
            people[lastPerson] = person;
            lastPerson++;
        } else {
            System.out.println("Pełna kadra");
        }
    }

    public void getInfo() {
        System.out.println("Pracownicy szpitala:");
        for (int i = 0; i < lastPerson; i++) {
            System.out.print("Imię: " + people[i].getFirstName() +
                    ", Nazwisko: " + people[i].getLastName() +
                    ", Wypłata: " + people[i].getPayment());
            if (people[i] instanceof Doctor) {
                // rzutujemy referencję Person na Doctor, tylko wtedy, kiedy jest do niej przypisany obiekt Doctor
                System.out.print(", Premia: " + ((Doctor) people[i]).getBonus());
            }
            if (people[i] instanceof Nurse) {
                System.out.print(", Nadgodziny: " + ((Nurse) people[i]).getFirstName());
            }
            System.out.println();
        }
    }
}
