package app;

/**
 * Created by Piotr on 2019-10-31
 */
public enum Option {
    EXIT(0,"Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
    PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów/gazet");
    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
