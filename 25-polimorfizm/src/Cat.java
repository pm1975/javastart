/**
 * Created by Piotr on 2019-10-26
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Jestem kotem i nazywam się " + getName());
    }

    public void meow() {
        System.out.println("Miaaaaau");
    }
}
