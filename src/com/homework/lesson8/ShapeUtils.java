package com.homework.lesson8;

public class ShapeUtils {


    private ShapeUtils() {

    }

    public static boolean isEllupse(Shape shape) {
        return shape instanceof Shape.Ellipse;
    }

    public static boolean isCircle(Shape shape) {
        return shape instanceof Shape.Ellipse.Circle;
    }

    public static boolean isRectangle(Shape shape) {
        return shape instanceof Shape.Rectangle;
    }

    public static boolean isSquare(Shape shape) {
        return shape instanceof Shape.Rectangle.Square;
    }
}

