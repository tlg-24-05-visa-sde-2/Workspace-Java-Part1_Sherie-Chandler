package edu.geometry.client;


import java.awt.*;

public class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = (Shape) new Shape() {
            @Override
            public float calculateArea() {
                return 0;
            }
        };
        shapes[2] = new Triangle(5, 6, 45);

        // Get the area of each one then compute the total area of all the shapes combined.
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
        }
        System.out.println("Total area: " + totalArea);
    }
}
