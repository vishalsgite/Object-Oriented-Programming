package LambdaExpression;

import java.util.Arrays;
import java.util.List;


//Lambda with Streams
public class LambdaStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Lambda with Stream API
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Even number: " + n));
    }
}

/*
Explanation:
The Stream API uses lambda expressions to filter and process elements.
 Here, n -> n % 2 == 0 is used to filter even numbers,
 and n -> System.out.println("Even number: " + n) is used to print them.
 */