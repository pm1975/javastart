package SpecyfikatoryDostepu.app;

import SpecyfikatoryDostepu.data.Point;
import SpecyfikatoryDostepu.controller.PointController;

/**
 * Created by Piotr on 2019-09-28
 */
public class PointApplication {
    public static void main(String[] args) {
        final int ADD_X = 1;
        final int ADD_Y = 2;
        final int MINUS_X = 3;
        final int MINUS_Y = 4;
        Point point = new Point(0,0);
        point.print();
        PointController pointController = new PointController();
        int option = ADD_X;
        switch (option){
            case 1:
                pointController.addX(point);
                break;
            case 2:
                pointController.addY(point);
                break;
            case 3:
                pointController.minusX(point);
                break;
            case 4:
                pointController.minusY(point);
                break;
        }

        point.print();

    }
}
