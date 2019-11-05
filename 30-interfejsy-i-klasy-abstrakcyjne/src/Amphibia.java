public class Amphibia implements ICar, IBoat {

    @Override
    public void printName() {
        System.out.print("Amphibia to trochę ");
        ICar.super.printName();
        System.out.print(" a trochę ");
        IBoat.super.printName();
    }
}
