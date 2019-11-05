package zadanie.app;

/**
 * Created by Piotr on 2019-11-05
 */
public class ShapeCalculator {
    private static final String APP_DESCRIPTION = "Obliczanie pól i obwodów figur";
    public static void main(String[] args) {
        System.out.println(APP_DESCRIPTION);
        ShareControl shareControl = new ShareControl();
        shareControl.controlLoop();
    }
}
