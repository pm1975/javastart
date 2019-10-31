package z27_typ_wyliczeniowy_enum.moja_proba;

/**
 * Created by Piotr on 2019-10-31
 */
public enum Pizza {
    MARGHERITA("sos pomidorowy + ser", 1),
    CAPRICIOSA("sos pomidorowy + ser + pieczarki", 2),
    PROSCIUTTO("sos pomidorowy + ser + szynka", 3);

    private final String description;
    private final int number;

    Pizza(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    public static Pizza fromNumber(int number) {
        Pizza[] values = values();
        for (Pizza value : values) {
            if (value.getNumber() == number) {
                return value;
            }
        }
        return null;
    }

    public static Pizza fromDescription(String description) {
        Pizza[] values = values();
        for (Pizza value : values) {
            if (value.getDescription().equals(description)) {
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name() + " "  + description;
    }
}
