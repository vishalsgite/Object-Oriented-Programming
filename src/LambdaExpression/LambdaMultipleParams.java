package LambdaExpression;

import java.util.function.BiFunction;

//Multiple Parameters in Lambda
public class LambdaMultipleParams {
    public static void main(String[] args) {
        // Using Lambda to add two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + add.apply(10, 20));
    }
}

/*
Explanation:
The BiFunction interface is used here, which takes two arguments (a, b) and returns their sum a + b.
 */