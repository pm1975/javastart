/**
 * Created by Piotr on 2019-09-30
 */
public class HelloName {
    public static void main(String[] args) {
        int option = 1;

        switch (option) {
            case 0:
                System.out.println("Koniec programu");
                break;
            case 1:
                System.out.println("Dodawanie nowej osoby");
                break;
            default:
                System.out.println("Opcja nieznana");
        }

//        final String name1 = "Krzysiek";
//        final String name2 = "Piotrek";
//        final String name3 = "Wojtek";
//        final String name4 = "Maciek";
//
//        String name = "Piotrek";
//        //od java7 switch obsługuje string (oprócz wartości liczbowych)
//        switch (name)  {
//            case name1:
//            case name2:
//            case name3:
//                System.out.println("Siema użytkowniku, witaj w aplikacji");
//                break;
//            case name4:
//                System.out.println("Witaj Panie prezesie, jak mija dzień?");
//                break;
//            default:
//                System.out.println("Witaj nieznany użytkowniku");
//        }
    }

}
