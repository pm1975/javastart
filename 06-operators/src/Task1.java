import java.util.Random;

/**
 * Created by Piotr on 2019-09-11
 */
public class Task1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int x = generator.nextInt(100);
        int y = generator.nextInt(100);

        System.out.println("x = " + x + ", y = " + y);

        //Czy x jest większe od y?
        boolean result = x > y;
        System.out.println("x > y ? " + result);

        //Czy x * 2 jest większe od y?
        result = x * 2 > y;
        System.out.println("x * 2 > y ? " + result);

        //Czy y < x + 3 i y > x - 2
        result = y < x + 3 && y > x - 2;
        System.out.println("y < x + 3 && y > y - 2? " + result);

        if ((x * y) % 2 == 0)
            result = true;
        else
            result = false;
        System.out.println("Czy iloczyn x * y jest parzysty? " + result);
    }
}
