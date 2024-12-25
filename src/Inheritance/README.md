<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inheritance in Java</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f5f5f5;
            color: #333;
            line-height: 1.8;
        }
        .container {
            max-width: 1000px;
            margin: auto;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
        }
        h1 {
            color: #004d99;
            text-align: center;
        }
        h2 {
            color: #333;
            border-bottom: 2px solid #004d99;
            padding-bottom: 5px;
        }
        ul, p {
            margin: 10px 0;
        }
        li {
            margin-bottom: 5px;
        }
        code {
            background: #f4f4f4;
            padding: 3px 5px;
            border-radius: 5px;
            font-size: 0.95em;
        }
        .example {
            background: #e8f6ff;
            padding: 15px;
            margin: 15px 0;
            border-left: 4px solid #004d99;
        }
        pre {
            background: #f4f4f4;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
        .note {
            background: #fffbe6;
            border-left: 4px solid #ffcc00;
            padding: 10px;
            margin: 15px 0;
        }
        footer {
            text-align: center;
            margin-top: 20px;
            font-size: 0.9em;
            color: #777;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Inheritance in Java</h1>

    <h2>What is Inheritance?</h2>
    <p>Inheritance is a key feature of Object-Oriented Programming (OOP) in Java, allowing one class (child or subclass) to acquire the properties and methods of another class (parent or superclass). It promotes code reusability and establishes a hierarchical relationship between classes.</p>

    <h2>Types of Inheritance</h2>
    <ul>
        <li><b>Single Inheritance:</b> A class inherits from one superclass.</li>
        <li><b>Multilevel Inheritance:</b> A class inherits from a class that is itself a subclass of another class.</li>
        <li><b>Hierarchical Inheritance:</b> Multiple classes inherit from a single parent class.</li>
        <li><b>Java Restriction:</b> Java does not support <b>multiple inheritance</b> using classes to avoid ambiguity. However, multiple inheritance can be achieved using <code>interfaces</code>.</li>
    </ul>

    <h2>Syntax</h2>
    <p>Inheritance is implemented using the <code>extends</code> keyword:</p>
    <pre>
class Parent {
    // Parent class members
}

class Child extends Parent {
    // Child class inherits properties and methods of Parent
}
        </pre>

    <h2>Why Use Inheritance?</h2>
    <ul>
        <li>Reusability of code</li>
        <li>Overriding methods to provide specific implementations</li>
        <li>Supports <b>runtime polymorphism</b></li>
        <li>Establishes a hierarchical class structure</li>
    </ul>

    <h2>Key Concepts for Interviews</h2>
    <ul>
        <li><b>Super Keyword:</b> Refers to the parent class. Used to access parent methods, constructors, or variables.</li>
        <li><b>Method Overriding:</b> A child class can redefine a method from the parent class.</li>
        <li><b>Access Modifiers:</b> Inheritance respects access levels:
            <ul>
                <li><b>Private:</b> Not inherited.</li>
                <li><b>Protected:</b> Accessible in child classes.</li>
                <li><b>Public:</b> Fully accessible.</li>
                <li><b>Default:</b> Accessible within the same package.</li>
            </ul>
        </li>
        <li><b>Object Class:</b> The root of all Java classes.</li>
    </ul>

    <h2>Example: Single Inheritance</h2>
    <div class="example">
            <pre>
class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Access Parent method
        obj.show();    // Access Child method
    }
}
            </pre>
    </div>

    <h2>Example: Method Overriding</h2>
    <div class="example">
            <pre>
class Parent {
    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Runtime Polymorphism
        obj.display(); // Output: Child Method
    }
}
            </pre>
    </div>

    <h2>Restrictions and Notes</h2>
    <div class="note">
        <ul>
            <li>A constructor is not inherited, but the parent constructor can be called using <code>super()</code>.</li>
            <li>Private members of the parent class are not inherited.</li>
            <li>Java supports multiple inheritance through interfaces, not classes.</li>
            <li><b>Final Class:</b> A class declared as <code>final</code> cannot be inherited.</li>
        </ul>
    </div>

    <footer>
        <p>&copy; 2024 Java Inheritance Guide</p>
    </footer>
</div>
</body>
</html>
