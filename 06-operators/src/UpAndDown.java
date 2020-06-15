/**
 * Created by Piotr on 2019-09-10
 */
public class UpAndDown {
    //INKREMENTACJA (++), DEKREMENTACJA (--)
    //PRZYROSTKOWA (x++), PRZEDROSTKOWA (++x)
    public static void main(String[] args) {
        int num = 3;

        //najpierw wyświetla, później zwiększa
        System.out.println(num++);
        System.out.println(num);

        //najpierw zwiększa, później wyświetla
        System.out.println(++num);
        System.out.println(num);
    }
}
