package dziedziczenie;

/**
 * Created by Piotr on 2019-10-24
 */
public class ExhaustPart extends Part {
    private boolean europeanStandard;

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    public ExhaustPart(int id, String manufacturer, String productName, String productSeries, boolean europeanStandard) {
        super(id, manufacturer, productName, productSeries);
        this.europeanStandard = europeanStandard;
    }
}
