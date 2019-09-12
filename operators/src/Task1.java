import java.util.Random;

/**
 * Created by Piotr on 2019-09-11
 */
public class Task1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int x = generator.nextInt(10);
        int y = generator.nextInt(10);
        boolean result;
        System.out.println("x = " + x + ", y = " + y);
        result = x < y;
        System.out.println("x < y ? " + result);

        result = x * 2 < y;
        System.out.println("x * 2 < y ? " + result);

        result = y < x + 3 && y < x - 2;
        System.out.println("y < x + 3 && y < y - 2? " + result);

        if (x * y % 2 == 0)
            result = true;
        else
            result = false;
        System.out.println("Iloczyn x * y jest parzysty? " + result);
    }
}
