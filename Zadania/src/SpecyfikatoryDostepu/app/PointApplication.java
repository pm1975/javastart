package SpecyfikatoryDostepu.app;

import SpecyfikatoryDostepu.data.Point;
import SpecyfikatoryDostepu.controller.PointController;

/**
 * Created by Piotr on 2019-09-28
 */
public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(0,0);
        point.print();
        PointController pointController = new PointController();
        pointController.addX(point);
        point.print();
        pointController.addY(point);
        point.print();
        pointController.minusX(point);
        point.print();
        pointController.minusY(point);
        point.print();
    }
}
