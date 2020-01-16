import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Piotr on 2020-01-10
 */
public class ClientServiceArrayBlockingQueue {
    public static void main(String[] args) {
        /*
        Kolejka blokująca
        musimy podać maksymalną wielkość kolejki
         */
        Queue<String> clients = new ArrayBlockingQueue<>(3);
        clients.add("Karol");
        clients.add("Patrycja");
        clients.add("Andrzej");
        clients.add("Karolina");
        /*
        add wyrzuca wyjątek IllegalStateException: Queue full po przekroczeniu rozmiaru kolejki
        offer wrzuca tyle ile przyjmie kolejka i więcej nie, nie wyrzucając wyjątku
         */

        //peek() poll()
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println(clients);
    }
}
