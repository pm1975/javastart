package przyklad2;

/**
 * Created by Piotr on 2019-10-22
 */
public class Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Burp Burp");
    }
}
