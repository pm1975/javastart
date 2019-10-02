/**
 * Created by Piotr on 2019-09-30
 */
public class UserManager {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
        System.out.println("Wybierz opcję");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyswietl informację o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        int option = 2;
        if (option == 0) {
            System.out.println("Koniec");
        } else if (option == 1) {
            System.out.println("Użytkownik " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setLastName("Powolny");
            user.setFirstName("Marian");
            System.out.println("Zmodyfikowane dane użytkownika " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Błędna opcja");
        }
    }
}
