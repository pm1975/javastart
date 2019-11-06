package zadanie;

public class App {
    public static void main(String[] args) {
        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        Sortable sorter = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab.length - i; j++) {
                        if (j + 1 < tab.length-i && tab[j] > tab[j+1]) {
                            int temp = tab[j];
                            tab[j] = tab[j + 1];
                            tab[j+1] = temp;
                        }
                    }
                }
                return tab;
            }
        };
        sorter.sort(tab);
        System.out.println("Tablica po sortowaniu:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
