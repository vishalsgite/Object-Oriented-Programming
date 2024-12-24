package LambdaExpression;

//Lambda for Comparator

import java.util.Arrays;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

        // Using Lambda to sort
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted names: " + names);
    }
}

/*
Explanation:
The Comparator interface has a single abstract method compare().
 The lambda expression (s1, s2) -> s1.compareTo(s2) provides its implementation.
 */