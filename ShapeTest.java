import java.util.Scanner;

// Interface Shape\interface Shape {
    void draw();
    double getArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Main class to test the program
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        circle.draw();
        System.out.println("Area of Circle: " + circle.getArea());
        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        
        scanner.close();
    }
}
