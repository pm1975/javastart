package z25_polimorfizm.poprawnie;

/**
 * Created by Piotr on 2019-10-30
 */
public class Nurse extends Person {
    private double overtime;

    public Nurse(String firstName, String lastName, double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime;
    }
}
