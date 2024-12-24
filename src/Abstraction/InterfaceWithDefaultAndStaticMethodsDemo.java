package Abstraction;


//Interfaces can have default and static methods starting from Java 8.
interface Calculator {
    int add(int a, int b); // Abstract method

    default int subtract(int a, int b) { // Default method
        return a - b;
    }

    static void showCalculatorType() { // Static method
        System.out.println("This is a basic calculator.");
    }
}

class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class InterfaceWithDefaultAndStaticMethodsDemo {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));

        Calculator.showCalculatorType(); // Calling static method
    }
}
