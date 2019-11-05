//METODY PRYWATNE (JAVA 9)

public interface Example {
    default void complicatedMethod() {
        read(); //np. wczytanie czegoś z pliku
        calculate(); //wykonanie obliczeń
        save(); //zapisanie czegoś w pliku
    }

    private void read() {
        //wczytujemy
    }
    private void calculate() {
        //obliczamy
    }
    private  void save() {
        //zapisujemy
    }
}
