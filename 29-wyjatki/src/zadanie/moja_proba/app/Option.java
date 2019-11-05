package src.zadanie.moja_proba.app;

import src.zadanie.UnknownOperatorException;

/**
 * Created by Piotr on 2019-11-04
 */
public enum Option {
    ADD('+', "Dodawanie"),
    MINUS('-', "Odejmowanie"),
    MULTIPLY('*', "Mnożenie"),
    DIVIDE('/', "Dzielenie"),
    EXIT('q', "Wyjście z programu");

    private char value;
    private String description;

    Option(char value, String description) {
        this.value = value;
        this.description = description;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Option fromChar(char value) throws UnknownOperatorException {
        Option[] options = values();
        for (Option option : options) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new UnknownOperatorException("Nieprawny wybór.");
    }

    static Option createFromChar(char option) throws UnknownOperatorException {
        return Option.values()[option];
    }

    @Override
    public String toString() {
        return value + " " + description;
    }
}
