/**
 * Created by Piotr on 2019-10-31
 */
public enum Size {
    XSMALL("Bardzo mały"),
    SMALL("Mały"),
    MEDIUM("Średni"),
    LARGE("Duży"),
    XLARGE("Bardzo duży");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values) {
            if (size.getDescription().equals(description)) {
                return size;
            }
        }
        return null;
    }
}
