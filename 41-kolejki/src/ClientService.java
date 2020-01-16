import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Piotr on 2020-01-10
 */
public class ClientService {
    public static void main(String[] args) {
        Queue<Client> clients = new PriorityQueue<>();
        clients.add(new Client("Karol", 2));
        clients.add(new Client("Patrycja", 1));
        clients.add(new Client("Andrzej", 4));
        clients.add(new Client("Karolina", 3));

        //peek() poll()
        System.out.println(clients);
        while (!clients.isEmpty()) {
            System.out.println("Obsługiwany klient " + clients.poll());
        }
        System.out.println(clients);

        /*
        komparator - obiekt klasy anonimowej
         */
        clients = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber());
            }
        });
        clients.add(new Client("Karol", 2));
        clients.add(new Client("Patrycja", 1));
        clients.add(new Client("Andrzej", 4));
        clients.add(new Client("Karolina", 3));

        //peek() poll()
        System.out.println(clients);
        while (!clients.isEmpty()) {
            System.out.println("Obsługiwany klient " + clients.poll());
        }
        System.out.println(clients);
    }
}
