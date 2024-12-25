# Inheritance in Java

Inheritance is a key feature of Object-Oriented Programming (OOP) in Java, allowing one class (child or subclass) to acquire the properties and methods of another class (parent or superclass). It promotes code reusability and establishes a hierarchical relationship between classes.

## Types of Inheritance

- **Single Inheritance:** A class inherits from one superclass.
- **Multilevel Inheritance:** A class inherits from a class that is itself a subclass of another class.
- **Hierarchical Inheritance:** Multiple classes inherit from a single parent class.
- **Java Restriction:** Java does not support **multiple inheritance** using classes to avoid ambiguity. However, multiple inheritance can be achieved using `interfaces`.

## Syntax

Inheritance is implemented using the `extends` keyword:

```java
class Parent {
    // Parent class members
}

class Child extends Parent {
    // Child class inherits properties and methods of Parent
}

```
### Why Use Inheritance?
- Reusability of code
- Overriding methods to provide specific implementations
- Supports runtime polymorphism
- Establishes a hierarchical class structure

### Key Concepts for Interviews
- **Super Keyword:** Refers to the parent class. Used to access parent methods, constructors, or variables.
- **Method Overriding:** A child class can redefine a method from the parent class.
- **Access Modifiers:** Inheritance respects access levels:
- **Private:** Not inherited.
- **Protected:** Accessible in child classes.
- **Public:** Fully accessible.
- **Default:** Accessible within the same package.
- **Object Class:** The root of all Java classes.

### Restrictions and Notes
- A constructor is not inherited, but the parent constructor can be called using super().
- Private members of the parent class are not inherited.
- Java supports multiple inheritance through interfaces, not classes.
- Final Class: A class declared as final cannot be inherited.