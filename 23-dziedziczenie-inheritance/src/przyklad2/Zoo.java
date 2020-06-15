package przyklad2;

/**
 * Created by Piotr on 2019-10-22
 */
public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Czarny");
        Bird bird = new Bird();
        bird.setColor("Niebieski");
        System.out.println("Zwierzęta dają głos: ");
        System.out.println("Kot: ");
        cat.makeSound();

        System.out.println("Ptak: ");
        bird.makeSound();
    }
}
