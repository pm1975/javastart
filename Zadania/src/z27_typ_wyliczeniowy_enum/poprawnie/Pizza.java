package z27_typ_wyliczeniowy_enum.poprawnie;

/**
 * Created by Piotr on 2019-10-31
 */
public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true,true, false),
    PROSCIUTTO(true, true, false, true);

    private boolean tomatoSuace;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;

    private Pizza(boolean tomatoSuace, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSuace = tomatoSuace;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public boolean isTomatoSuace() {
        return tomatoSuace;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    @Override
    public String toString() {
        //przypisanie nazwy pizzy
        String result = this.name() + "(";
        //informacja o składnikach
        if (tomatoSuace) {
            result += "sos pomidorowy";
        }
        if (cheese) {
            result += ", ser";
        }
        if (mushrooms) {
            result += ", pieczarki";
        }
        if (ham) {
            result += ", szynka";
        }
        result += ")";
        return result;
    }
}
