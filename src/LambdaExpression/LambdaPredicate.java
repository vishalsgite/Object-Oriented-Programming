package LambdaExpression;

import java.util.function.Predicate;


//Lambda with Predicate
public class LambdaPredicate {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = str -> str != null && !str.isEmpty();
        System.out.println("Is string not empty? " + isNotEmpty.test("Hello"));
    }
}

/*
Explanation:
The Predicate functional interface tests a condition.
The lambda str -> str != null && !str.isEmpty() checks if a string is not empty.
 */