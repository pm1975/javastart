package polimorfizm_moja_proba;

/**
 * Created by Piotr on 2019-10-30
 */
public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Person doctor = new Doctor("Maciek", "Profeska", 7500, 1300);
        hospital.add(doctor);
        Person nurse1 = new Nurse("Ania", "Dobroszewska", 2200, 6);
        Person nurse2 = new Nurse("Marta", "Danielska", 2100, 3);
        hospital.add(nurse1);
        hospital.add(nurse2);
        hospital.getInfo();
    }
}
