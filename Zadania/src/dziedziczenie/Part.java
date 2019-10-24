package dziedziczenie;

/**
 * Created by Piotr on 2019-10-24
 */
public class Part {
    private int id;
    private String manufacturer;
    private String productName;
    private String productSeries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSeries() {
        return productSeries;
    }

    public void setProductSeries(String productSeries) {
        this.productSeries = productSeries;
    }

    public Part(int id, String manufacturer, String productName, String productSeries) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.productSeries = productSeries;
    }
}
