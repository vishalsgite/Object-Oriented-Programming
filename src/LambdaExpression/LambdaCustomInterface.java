package LambdaExpression;


// Using Lambda with Functional Interfaces (Custom Example)
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaCustomInterface {
    public static void main(String[] args) {
        // Lambda expression for Greeting interface
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Alice");
    }
}

/*
Explanation:
A custom functional interface Greeting is created with a single method sayHello.
The lambda expression name -> System.out.println("Hello, " + name + "!") implements it.
 */