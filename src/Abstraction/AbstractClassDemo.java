package Abstraction;


//An abstract class can have both abstract (unimplemented) and concrete (implemented) methods.
abstract class Shape {
    abstract void draw(); // Abstract method (no implementation)

    public void show() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.show();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.show();
    }
}
