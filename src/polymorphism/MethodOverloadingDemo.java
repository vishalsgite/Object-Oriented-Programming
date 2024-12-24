package polymorphism;


//Method overloading occurs when multiple methods in
// the same class have the same name but different parameter lists.
class Calculator {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.add(5, 10));
        System.out.println("Sum (double, double): " + calc.add(5.5, 4.5));
        System.out.println("Sum (int, int, int): " + calc.add(1, 2, 3));
    }
}
