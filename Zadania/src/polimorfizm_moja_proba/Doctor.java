package polimorfizm_moja_proba;

/**
 * Created by Piotr on 2019-10-29
 */
public class Doctor extends Person {
    private double bonus;

    public Doctor(String firstName, String lastName, double payment, double bonus) {
        super(firstName, lastName, payment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
