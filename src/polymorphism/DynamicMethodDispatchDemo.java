package polymorphism;


//Dynamic method dispatch allows calling overridden methods using a parent class reference.
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
