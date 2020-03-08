package com.homework.lesson8;

public class TestShape {
    public static void main(String[] args) {

        Shape.Ellipse ellipse = new Shape.Ellipse(12, 12);
        Shape.Ellipse ellipse2 = new Shape.Ellipse(12, 15);
        Shape.Ellipse.Circle circle = new Shape.Ellipse.Circle(15);
        Shape.Rectangle rectangle = new Shape.Rectangle(4, 1);
        Shape.Rectangle.Square square = new Shape.Rectangle.Square(2);
        Shape.Rectangle.Rhomb rhomb = new Shape.Rectangle.Rhomb(12, 12);
        Shape.Rectangle.Trapezium trapezium = new Shape.Rectangle.Trapezium(5,8,6,6,8);
        Shape.Triangle traingle = new Shape.Triangle(12, 15, 15);

        System.out.println(ellipse.equalsShapeSquare(ellipse2)); // Сравниваем площадь Эллипсов 12-12 и 12-15
        System.out.println(rectangle.equalsShapeSquare(square)); // Сравниваем площадь Прямоугольника 4х1 и Квадрата 2
        System.out.println(ShapeUtils.isRectangle(circle)); // Определяем является ли фигура прямоугольником
        System.out.println(ShapeUtils.isRectangle(rectangle)); // Определяем является ли фигура прямоугольником
        System.out.println(rhomb.getPerimeter()); // Получаем перимтер ромба
        System.out.println(trapezium.toString()); // Получаем метод toString
    }


}
