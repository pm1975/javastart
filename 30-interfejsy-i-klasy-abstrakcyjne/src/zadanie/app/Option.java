package zadanie.app;

import zadanie.exception.NoSuchOptionException;

/**
 * Created by Piotr on 2019-11-05
 */
public enum Option {
    EXIT(0, "Wyjście z programu:"),
    RECTANGLE_AREA(1, "Pole prostokąta:"),
    RECTANGLE_PERIMETER(2, "Obwód prostokąta"),
    CIRCLE_AREA(3, "Pole okręgu"),
    CIRCLE_PERIMETER(4, "Obwód okręgu"),
    TRIANGLE_AREA(5, "Pole trójkąta"),
    TRIANGLE_PERIMETER(6, "Obwód trójkąta");

    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getValue() + " " + getDescription();
    }
    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + option);
        }
    }
}
