package task;

/**
 * Created by Piotr on 2019-11-16
 */
public class Pair<T,V> {
    private T variable1;
    private V variable2;

    public T getVariable1() {
        return variable1;
    }

    public void setVariable1(T variable1) {
        this.variable1 = variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public void setVariable2(V variable2) {
        this.variable2 = variable2;
    }

    public Pair() {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
}
