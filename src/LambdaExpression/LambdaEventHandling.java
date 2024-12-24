package LambdaExpression;

import javax.swing.*;
import java.awt.event.ActionListener;

//Lambda for Event Handling (GUI Example)
public class LambdaEventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Event Handling");
        JButton button = new JButton("Click Me");

        // Using Lambda for ActionListener
        button.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
Explanation:
The ActionListener interface has a single abstract method actionPerformed().
The lambda expression e -> System.out.println("Button clicked!") provides its implementation.
 */