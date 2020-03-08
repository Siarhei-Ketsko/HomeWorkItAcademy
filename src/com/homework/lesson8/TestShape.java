package com.homework.lesson8;

public class TestShape {
    public static void main(String[] args) {

        Shape.Ellipse ellipse = new Shape.Ellipse(12, 12);
        Shape.Ellipse ellipse1 = new Shape.Ellipse(12,13);
        Shape.Ellipse.Circle circle = new Shape.Ellipse.Circle(15);
        Shape.Rectangle rectangle = new Shape.Rectangle(15,12);
        Shape.Rectangle rectangle1 = new Shape.Rectangle(15,12);
        Shape.Rectangle.Square square = new Shape.Rectangle.Square(19);
        Shape.Rectangle.Square square1 = new Shape.Rectangle.Square(19);
        Shape.Rectangle.Rhomb rhomb = new Shape.Rectangle.Rhomb(12,12);
        Shape.Triangle traingle = new Shape.Triangle(12,15,15);

     //   System.out.println(ShapeUtils.isEllupse(ellipse));
     //   System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ellipse.equalsShapeSquare(ellipse1));
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse1.getSquare());
        System.out.println(rhomb.getPerimeter());
        System.out.println(rhomb.getSquare());
        System.out.println(traingle.getPerimeter());
        System.out.println(traingle.getSquare());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
      //  System.out.println(rectangle.equalsShapeSquare(rectangle1));

    }


}
