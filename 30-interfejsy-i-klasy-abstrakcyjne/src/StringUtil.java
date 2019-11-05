//METODY STATYCZNE (JAVA 8)
//przydatne do definiowania prostych metod użytkowych
public interface StringUtil {
    static String revert(String original) {
        return new StringBuilder(original).reverse().toString();
        //powyższa metoda odwraca tekst przekazany jako argument
    }
}
