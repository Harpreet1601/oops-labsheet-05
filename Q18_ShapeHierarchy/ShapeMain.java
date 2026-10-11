// Q18. Shape Hierarchy - Parent Reference Array

// Super class
class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

// Child class 1
class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

// Manager class: loop and area processing happen here, not in main()
class ShapeManager {
    void displayAreas(Shape[] shapes) {
        // 'i' is a local loop variable
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();
            // Identify the real child object before calling its own area method
            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                System.out.println("Area: " + c.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapes[i];
                System.out.println("Area: " + r.calculateArea());
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        // Parent-type array holding child objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Rectangle("Rectangle", 6, 4);

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}
