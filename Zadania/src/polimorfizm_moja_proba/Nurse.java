package polimorfizm_moja_proba;

/**
 * Created by Piotr on 2019-10-29
 */
public class Nurse extends Person {
    private double overtime; //nadgodziny

    public Nurse(String firstName, String lastName, double payment, int overtime) {
        super(firstName, lastName, payment);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

}
