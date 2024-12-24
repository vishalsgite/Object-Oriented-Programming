package LambdaExpression;

import java.util.function.Function;


//Returning Values with Lambda
public class LambdaReturnValue {
    public static void main(String[] args) {
        // Using Lambda to calculate square
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));
    }
}

/*
Explanation:
The Function interface is used here to define a
 lambda expression x -> x * x that takes an input and returns a square.
 */