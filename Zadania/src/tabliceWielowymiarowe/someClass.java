package tabliceWielowymiarowe;

/**
 * Created by Piotr on 2019-10-04
 */
public class someClass {
    public static void main(String[] args) {
        double[][] tab = new double[3][3];
        tab[0] = new double[]{1.0, 1.5, 2.0};
        tab[1] = new double[]{1.5, 2.0, 2.5};
        //another declaration
        double[] line2 = {2.0, 2.5, 3.0};
        tab[2] = line2;

        System.out.println("Tablica:");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        };

        double sumMulti = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]);
        System.out.println("Suma iloczynów przekątnych tablicy: " + sumMulti);
        double multiSum = (tab[1][0] + tab[1][1] + tab[1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy: " + multiSum);
        double sumAllBorder = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędzi tablicy: " + sumAllBorder);
    }
}
