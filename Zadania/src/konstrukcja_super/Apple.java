package konstrukcja_super;

/**
 * Created by Piotr on 2019-10-26
 */
public class Apple extends Fruit {
    private String appleType; //odmiana

    public Apple(String appleType) {
        this.appleType = appleType;
    }

    public String getVariety() {
        return appleType;
    }

    public void setVariety(String variety) {
        this.appleType = variety;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabłko " + appleType);
    }
}
