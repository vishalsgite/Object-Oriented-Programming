package LambdaExpression;

//Using a Lambda Expression to Implement a Runnable

public class LambdaExample {
    public static void main(String[] args) {
        // Using Lambda to implement Runnable
        Runnable runnable = () -> System.out.println("Hello from Lambda Runnable!");
        new Thread(runnable).start();
    }
}


/*
The Runnable interface has a single abstract method run().
The lambda expression () -> System.out.println("Hello from Lambda Runnable!") provides its implementation.
 */