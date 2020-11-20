package com.company;

import static java.lang.Math.*;

public class Circle {
    private double radiusOfCircle;

    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    public double getRadiusOfCircleOfCircle() {
        return radiusOfCircle;
    }

    public void setRadiusOfCircle(double radiusOfCircle) {
        if (radiusOfCircle > 0) {
            this.radiusOfCircle = radiusOfCircle;
        } else {
            throw new ArithmeticException("Radius must be a positive number!");
        }
    }

    public double SquareOfCircle() {
        return PI * Math.pow(radiusOfCircle, 2);
    }

}
