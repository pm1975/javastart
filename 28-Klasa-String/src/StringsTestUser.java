import java.util.Scanner;

/**
 * Created by Piotr on 2019-11-01
 */
public class StringsTestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj napis 1:");
        String str1 = sc.nextLine();
        System.out.println("Podaj napis 2:");
        String str2 = sc.nextLine();

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1.equals(str2) " + (str1.equals(str2)));

    }
}
