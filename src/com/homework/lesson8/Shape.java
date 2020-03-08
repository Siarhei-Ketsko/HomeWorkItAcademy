package com.homework.lesson8;

public abstract class Shape {


    public abstract double getPerimeter();

    public abstract double getSquare();



    public static class Ellipse extends Shape { ////////////////////Ellipse
        private double a;
        private double b;

        Ellipse(double a, double b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public double getPerimeter() {
            return 4 * (Math.PI * a * b + (a - b)) / a + b;
        }

        @Override
        public double getSquare() {
            return a * b * Math.PI;
        }

        public boolean equalsShapeSquare(Shape shape) {
            return shape.getSquare() == getSquare();
        }

        public static class Circle extends Shape {  ///////////////Circle
            private double a;

            Circle(double radius) {
                a = radius;
            }

            @Override
            public double getPerimeter() {
                return 2*Math.PI*a;
            }
            @Override
            public double getSquare() {
                return Math.PI * a * a;
            }
        } //////////////Circle

    }////////////////////Ellipse

    public static class Rectangle extends Shape {//////////////Rectangle
        private double a;
        private double b;

        Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public double getPerimeter() {
            return 2 * (a + b);
        }
        @Override
        public double getSquare() {
            return a * b;
        }


        public static class Square extends Shape { /////////////// Square
            private double a;

            Square(double side) {
                a = side;
            }

            @Override
            public double getPerimeter() {
                return 4*a;
            }

            @Override
            public double getSquare() {
                return a*a;
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
                return Math.sqrt(Math.pow(d1/2,2)+Math.pow(d2/2,2))*4;
            }

            @Override
            public double getSquare() {
                return (d1*d2)/2;
            }
        } ////////// Rhomb
        public static class Trapezium extends Shape { /////////////Trapezium
            private double a;
            private double b;
            private double c;
            private double d;
            private double h;

            Trapezium(double a, double b, double c, double d, double h) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.h = h;
            }

            @Override
            public double getPerimeter() {
                return a+b+c+d;
            }

            @Override
            public double getSquare() {
                return 0.5*(a+b)*h;
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
            return a+b+c;
        }

        @Override
        public double getSquare() {
            double p = 0.5*(a+b+c);
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
    } //////////////////Triangle
}
