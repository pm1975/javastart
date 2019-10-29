/**
 * Created by Piotr on 2019-10-26
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void giveSound() {
        System.out.println("Jestem zwierzęciem i nazywam się " + getName());
    }
}
