package com.polymorphism;

    class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    class Square extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Square");
        }
    }

public class Upcasting {
        public static void main(String[] args) {
            // Upcasting: parent ref → child object
            Shape s1 = new Circle();
            Shape s2 = new Square();

            s1.draw(); // calls Circle’s draw()
            s2.draw(); // calls Square’s draw()
        }
    }

