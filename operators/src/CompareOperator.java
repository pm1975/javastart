/**
 * Created by Piotr on 2019-09-10
 */
public class CompareOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("Czy X jest większy od Y?");
        boolean isXGreaterThanY = x > y;
        System.out.println(isXGreaterThanY);

        boolean xEqualsY = x != y;
        System.out.println("Czy X jest różny od Y?");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);
    }
}
