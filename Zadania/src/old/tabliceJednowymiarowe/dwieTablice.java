package old.tabliceJednowymiarowe;

/**
 * Created by Piotr on 2019-10-03
 */
class dwieTablice {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};

        System.out.println(addTwoArrays(numbers1, numbers2));
    }

    static int addTwoArrays(int[] numbers1, int[] numbers2) {
        int suma = 0;
        for (int i = 0; i < numbers1.length; i++) {
            suma += numbers1[i];
        }
        for (int i = 0; i < numbers2.length; i++) {
            suma += numbers2[i];
        }
        return suma;
    }
}
