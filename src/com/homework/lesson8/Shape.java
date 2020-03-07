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
         Rectangle(double a, double b) {
             this.a = a;
             this.b = b;
        }

        public double getPerimeter() {
            return 2 * (a + b);
        }
        public double getSquare() {
             return a * b;
        }

    }

}
