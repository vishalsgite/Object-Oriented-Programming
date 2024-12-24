package polymorphism;


//Static methods are not overridden but can be overloaded.
class StaticMethodExample {
    // Overloaded static methods
    public static void display(String message) {
        System.out.println("Message: " + message);
    }

    public static void display(int number) {
        System.out.println("Number: " + number);
    }
}

public class StaticPolymorphismDemo {
    public static void main(String[] args) {
        StaticMethodExample.display("Hello");
        StaticMethodExample.display(100);
    }
}
