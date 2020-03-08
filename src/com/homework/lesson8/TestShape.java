package com.homework.lesson8;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape.Ellipse ellipse = shape.new Ellipse(12, 12);
        Shape.Ellipse ellipse1 = shape.new Ellipse(12, 12);
        Shape.Ellipse.Circle circle = ellipse.new Circle(15);
        Shape.Rectangle rectangle = shape.new Rectangle(5, 5);
        Shape.Rectangle.Square square = rectangle.new Square(13);
        Shape.Rectangle.Rhomb rhomb = rectangle.new Rhomb(12,12);
        Shape.Traingle traingle = shape.new Traingle(12,12,12);

        ShapeUtils.isEllupse(ellipse);
        System.out.println(ellipse.equalsShape(ellipse1));
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse1.getSquare());
        System.out.println(rhomb.getPerimeter());
        System.out.println(rhomb.getSquare());
        System.out.println(traingle.getPerimeter());
        System.out.println(traingle.getSquare());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
    }


}
