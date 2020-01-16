/**
 * Created by Piotr on 2020-01-10
 */
public class Client implements Comparable<Client>{
    private String nickname;
    private int ordersNumber;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    public Client(String nickname, int ordersNumber) {
        this.nickname = nickname;
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return nickname + " " + ordersNumber;
    }

    @Override
    public int compareTo(Client c) {
        return -Integer.compare(ordersNumber, c.ordersNumber);
        /*
        zwróci 1 gdy ordersNumber > c.ordersNumber
        0 gdy są równe,
        -1 gdy ordersNumber < c.orderNumber

        Minus z przodu oznacza, że zamieniamy znak (sortowanie malejące
         */
    }
}
