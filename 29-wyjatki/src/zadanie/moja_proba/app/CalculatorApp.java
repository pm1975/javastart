package src.zadanie.moja_proba.app;

/**
 * Created by Piotr on 2019-11-04
 */
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Kalkulator");
        CalculatorControl calculatorControl = new CalculatorControl();
        calculatorControl.controlLoop();
    }
}
