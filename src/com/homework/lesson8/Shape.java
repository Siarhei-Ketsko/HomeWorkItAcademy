package com.homework.lesson8;

public abstract class Shape {


    public abstract double getPerimeter();

    public abstract double getSquare();

    public boolean equalsShapeSquare(Shape shape) {
        return getSquare() == shape.getSquare();
    }

    public static class Ellipse extends Shape { ////////////////////Ellipse
        private double a;
        private double b;

        Ellipse(double pointA, double pointB) {
            this.a = pointA;
            this.b = pointB;
        }

        @Override
        public double getPerimeter() {
            return 4 * (Math.PI * a * b + (a - b)) / a + b;
        }

        @Override
        public double getSquare() {
            return a * b * Math.PI;
        }

        @Override
        public boolean equalsShapeSquare(Shape shape) {
            return super.equalsShapeSquare(shape);
        }

        @Override
        public String toString() {
            return "Эллипс";
        }

        public static class Circle extends Shape {  ///////////////Circle
            private double a;

            Circle(double radius) {
                a = radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * a;
            }

            @Override
            public double getSquare() {
                return Math.PI * a * a;
            }

            @Override
            public String toString() {
                return "Круг";
            }

        } //////////////Circle

    }////////////////////Ellipse

    public static class Rectangle extends Shape {//////////////Rectangle
        private double a;
        private double b;

        Rectangle(double sideA, double sideB) {
            this.a = sideA;
            this.b = sideB;
        }

        @Override
        public double getPerimeter() {
            return 2 * (a + b);
        }

        @Override
        public double getSquare() {
            return a * b;
        }

        @Override
        public boolean equalsShapeSquare(Shape shape) {
            return super.equalsShapeSquare(shape);
        }

        @Override
        public String toString() {
            return "Прямоугольник";
        }

        public static class Square extends Shape { /////////////// Square
            private double a;

            Square(double sideA) {
                a = sideA;
            }

            @Override
            public double getPerimeter() {
                return 4 * a;
            }

            @Override
            public double getSquare() {
                return a * a;
            }

            @Override
            public boolean equalsShapeSquare(Shape shape) {
                return super.equalsShapeSquare(shape);
            }

            @Override
            public String toString() {
                return "Квадрат";
            }
        } ///////////// Square

        public static class Rhomb extends Shape { ////////// Rhomb
            double d1;
            double d2;

            Rhomb(double diagonalOne, double diagonalTwo) {
                this.d1 = diagonalOne;
                this.d2 = diagonalTwo;
            }

            @Override
            public double getPerimeter() {
                return Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 4;
            }

            @Override
            public double getSquare() {
                return (d1 * d2) / 2;
            }

            @Override
            public boolean equalsShapeSquare(Shape shape) {
                return super.equalsShapeSquare(shape);
            }

            @Override
            public String toString() {
                return "Ромб";
            }
        } ////////// Rhomb

        public static class Trapezium extends Shape { /////////////Trapezium
            private double a;
            private double b;
            private double c;
            private double d;
            private double h;

            Trapezium(double sideA, double sideB, double sideC, double sideD, double high) {
                this.a = sideA;
                this.b = sideB;
                this.c = sideC;
                this.d = sideD;
                this.h = high;
            }

            @Override
            public double getPerimeter() {
                return a + b + c + d;
            }

            @Override
            public double getSquare() {
                return 0.5 * (a + b) * h;
            }

            @Override
            public boolean equalsShapeSquare(Shape shape) {
                return super.equalsShapeSquare(shape);
            }

            @Override
            public String toString() {
                return "Трапеция";
            }
        }//////////////Trapezium


    } ////////////// Rectangle

    public static class Triangle extends Shape { ///////////Triangle
        private double a;
        private double b;
        private double c;


        Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double getPerimeter() {
            return a + b + c;
        }

        @Override
        public double getSquare() {
            double p = 0.5 * (a + b + c);
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public boolean equalsShapeSquare(Shape shape) {
            return super.equalsShapeSquare(shape);
        }

        @Override
        public String toString() {
            return "Треугольник";
        }
    } //////////////////Triangle
}
