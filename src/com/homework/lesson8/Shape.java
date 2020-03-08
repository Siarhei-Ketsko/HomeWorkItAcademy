package com.homework.lesson8;

public class Shape {


    public double getPerimeter() {
        return 0;
    }

    public double getSquare() {
        return 0;
    }


    public class Ellipse extends Shape { ////////////////////Ellipse
        private double a;
        private double b;

        Ellipse(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getPerimeter() {
            return 4 * (Math.PI * a * b + (a - b)) / a + b;
        }


        public double getSquare() {
            return a * b * Math.PI;
        }

        public class Circle extends Shape {  ///////////////Circle
            Circle(double radius) {
                a = radius;
            }

            public double geSquare() {
                return Math.PI * a * a;
            }
        } //////////////Circle

    }////////////////////Ellipse

    class Rectangle extends Shape {
        private double a;
        private double b;
         Rectangle(double a, double b) { //////////////Rectangle
             this.a = a;
             this.b = b;
        }

        public double getPerimeter() {
            return 2 * (a + b);
        }
        public double getSquare() {
             return a * b;
        }

        public class Square extends Shape { /////////////// Square

             Square(double side) {
                 a = side;
             }
        } ///////////// Square
        public class Rhomb extends Shape { ////////// Rhomb

             Rhomb(double side) {
                 a = side;
             }
        } ////////// Rhomb


    } ////////////// Rectangle
    public class Traingle extends Shape { ///////////Traingle
        private double a;
        private double b;
        private double c;


        Traingle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    } //////////////////Traingle

}
