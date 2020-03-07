package com.homework.lesson8;

public class ShapeUtils {
    public static void main(String[] args) {

        Shape o = new Shape();
        Shape.Ellipse ellipse = o.new Ellipse(12, 12);
        Shape.Ellipse.Circle circle = ellipse.new Circle(15);
        Shape.Rectangle rectangle = o.new Rectangle(5,5);
        System.out.println(isRectangle(rectangle));
        System.out.println(isEllupse(ellipse));
        System.out.println(isCircle(circle));
    }


    public static boolean isEllupse(Shape shape) {
        return  shape instanceof Shape.Ellipse;
    }

    public static boolean isCircle(Shape shape) {
        return shape instanceof Shape.Ellipse.Circle;
    }
    public static  boolean isRectangle(Shape shape) {
        return shape instanceof Shape.Rectangle;
        }
    }

