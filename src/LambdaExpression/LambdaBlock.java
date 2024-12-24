package LambdaExpression;


//Lambda with Block of Code
public class LambdaBlock {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda with multiple statements:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
        };
        new Thread(runnable).start();
    }
}

/*
Explanation:
A lambda expression can have multiple statements enclosed in {}. This is useful for more complex logic.
 */