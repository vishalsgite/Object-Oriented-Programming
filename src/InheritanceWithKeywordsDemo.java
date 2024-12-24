class Parent {
    // Static block
    static {
        System.out.println("Static block of Parent class executed.");
    }

    // Instance variables
    private int privateVar = 10; // private: Not inherited
    protected int protectedVar = 20; // protected: Inherited by subclass
    public int publicVar = 30; // public: Inherited and accessible

    // Constructor
    public Parent() {
        System.out.println("Parent class constructor executed.");
    }

    // Overloaded Constructor
    public Parent(int value) {
        this(); // Calls the default constructor
        System.out.println("Overloaded constructor of Parent class with value: " + value);
    }

    // Final method: Cannot be overridden
    public final void finalMethod() {
        System.out.println("Final method in Parent class.");
    }

    // Non-final method
    public void nonFinalMethod() {
        System.out.println("Non-final method in Parent class.");
    }
}

class Child extends Parent {
    // Static block
    static {
        System.out.println("Static block of Child class executed.");
    }

    // Instance variables
    private int childPrivateVar = 50;

    // Constructor
    public Child() {
        super(); // Calls the default constructor of the Parent class
        System.out.println("Child class constructor executed.");
    }

    // Overloaded Constructor
    public Child(int value) {
        super(value); // Calls the overloaded constructor of the Parent class
        System.out.println("Overloaded constructor of Child class with value: " + value);
    }

    // Using `this` keyword to call another constructor in the same class
    public Child(String message) {
        this(100); // Calls the overloaded constructor with an integer parameter
        System.out.println("Child class constructor with message: " + message);
    }

    // Overriding a non-final method
    @Override
    public void nonFinalMethod() {
        System.out.println("Overridden non-final method in Child class.");
    }

    // Final variables
    public final int FINAL_VAR = 100; // Must be initialized

    // Example method using this keyword
    public void showThisKeywordUsage() {
        System.out.println("Accessing childPrivateVar using this: " + this.childPrivateVar);
        System.out.println("Accessing publicVar using super: " + super.publicVar);
    }
}

public class InheritanceWithKeywordsDemo {
    // Static block
    static {
        System.out.println("Static block of Main class executed.");
    }

    public static void main(String[] args) {
        System.out.println("Creating Parent object:");
        Parent parent = new Parent();

        System.out.println("\nCreating Child object:");
        Child child = new Child();

        System.out.println("\nCreating Child object with overloaded constructor:");
        Child overloadedChild = new Child(200);

        System.out.println("\nCreating Child object with string constructor:");
        Child stringChild = new Child("Hello, Java!");

        System.out.println("\nCalling overridden and final methods:");
        child.nonFinalMethod(); // Calls overridden method in Child
        child.finalMethod(); // Calls final method in Parent

        System.out.println("\nUsing `this` and `super` keywords:");
        child.showThisKeywordUsage();
    }
}
