/**
 * Created by Piotr on 2019-10-03
 */
public class crossArray {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        tab[0][0] = 5;
        tab[1][1] = 5;
        tab[2][2] = 5;
        System.out.println("tab[0][0] = " + tab[0][0]);

        int[][] array = new int[3][]; //chcemy tablicę złożoną z 3 tablic (wierszy)
        array[0] = new int[3]; //pierwsza tablica z 3 elementami (kolumnami)
        array[1] = new int[2]; //druga z dwoma
        array[2] = new int[1]; //trzecia tylko z jednym

    }
}
