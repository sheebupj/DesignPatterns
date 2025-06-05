package com.paremal.sheebu.visitor;

import java.util.ArrayList;
import java.util.List;

// Visitor interface
interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);
    void visit(Rectangle rectangle);
}

// Element interface
interface Shape {
    void accept(ShapeVisitor visitor);
}

// Concrete Elements
class Circle implements Shape {
    double radiusOfCircle ;

    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Square implements Shape {
    double sideOfSquare ;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
class Rectangle implements Shape {
    double length ;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Triangle implements Shape {
    double baseOfTriangle;// = 3;
    double heightOfTriangle;// = 6;

    public Triangle(double heightOfTriangle, double baseOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
        this.baseOfTriangle = baseOfTriangle;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Visitors
class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;
    ;



    @Override
    public void visit(Circle circle) {
        // Calculate area of circle and update totalArea
        double area=Math.PI * Math.pow(circle.radiusOfCircle, 2);
        System.out.println("circle area="+area);
        totalArea += area;
    }

    @Override
    public void visit(Square square) {
        // Calculate area of square and update totalArea
        double area=Math.pow(square.sideOfSquare, 2);
        System.out.println("Squire area="+area);
        totalArea += area;
    }

    @Override
    public void visit(Triangle triangle) {
        // Calculate area of triangle and update totalArea
        double area=(triangle.baseOfTriangle * triangle.heightOfTriangle) / 2;
        totalArea += area;
        System.out.println("Triangle="+area);
    }
    @Override
    public void visit(Rectangle rectangle) {
        // Calculate area of triangle and update totalArea
        double area=(rectangle.length * rectangle.breadth) ;
        totalArea += area;
        System.out.println("Rectangle area="+area);
    }

    public double getTotalArea() {
        return totalArea;
    }
}

// Main class
public class VisitorImpl {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Square(4.0));
        shapes.add(new Triangle(3,6));
        shapes.add(new Rectangle(3,6));

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total area: " + areaCalculator.getTotalArea());
    }
}