package SpecyfikatoryDostepu.controller;

import SpecyfikatoryDostepu.data.Point;

/**
 * Created by Piotr on 2019-09-28
 */
public class PointController {
    public void addX(Point point) {
        point.setX(point.getX() + 1);
    }

    public void minusX(Point point) {
        point.setX(point.getX() - 1);
    }

    public void addY(Point point) {
        point.setY(point.getY() + 1);
    }

    public void minusY(Point point) {
        point.setY(point.getY() - 1);
    }
}
