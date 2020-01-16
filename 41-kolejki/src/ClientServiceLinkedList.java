import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Piotr on 2020-01-10
 */
public class ClientServiceLinkedList {
    public static void main(String[] args) {
        Queue<String> clients = new LinkedList<>();
        clients.add("Karol");
        clients.offer("Patrycja"); // W LinkedList to to samo co add.
        clients.offer("Andrzej");

        //peek() poll()
        String client1 = clients.peek();
        String client2 = clients.peek();
        String client3 = clients.peek();
        System.out.println(clients);

        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println(clients);
    }
}
