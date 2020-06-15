/**
 * Created by Piotr on 2019-10-26
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Kotopies");

        changeAnimalName(animals[0], "Pieseł");

        for (Animal animal : animals) {
            animal.giveSound();
        }

        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Mruczek");

        // rzutowanie do zmiennej
        Dog specificDog = (Dog) dog;
        specificDog.bark();

        // rzutowanie "w locie"
        ((Cat) cat).meow();

        if (cat instanceof Dog) {
            // rzutujemy referencję cat na Dog, tylko wtedy, kiedy jest do niej przypisany
            // obiekt Dog. W tym przypadku if się nie wykona i nie dojdzie do rzutowania.
            ((Dog) cat).bark();
        }

        Object burek = "Burek";
    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }
}
