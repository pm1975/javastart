package dziedziczenie;

/**
 * Created by Piotr on 2019-10-24
 */
public class Wheel extends Part {
    private double size;
    private double width;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Wheel(int id, String manufacturer, String productName, String productSeries, double size, double width) {
        super(id, manufacturer, productName, productSeries);
        this.size = size;
        this.width = width;
    }
}
