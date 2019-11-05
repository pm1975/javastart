package zadanie.model;

import zadanie.model.Shape;

/**
 * Created by Piotr on 2019-11-05
 */
public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }
}
