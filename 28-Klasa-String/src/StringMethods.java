/**
 * Created by Piotr on 2019-11-01
 */
public class StringMethods {
    public static void main(String[] args) {
        String words = "  Jeden dwa trzy cztery pięć sześć siedem ";
        String sub1 = words.substring(2, 7);
        String sub2 = words.replaceAll("dwa", "hehe");
        String sub3 = words.trim();
        char charat = words.charAt(2);

        System.out.println(words + "\n");
        System.out.println("words.substring(2, 7)");
        System.out.println(sub1 + "\n");
        System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
        System.out.println(sub2 + "\n");
        System.out.println("words.trim()");
        System.out.println(sub3 + "\n");
        System.out.println("words.charAt(2)");
        System.out.println(charat);
    }
}
