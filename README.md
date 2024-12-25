 # **JVM JDK &  JVM**

## **JVM - JAVA VIRTUAL MACHINE :** Like name suggest it is virutal machine , The Java Virtual Machine (JVM) is a crucial part of the Java Runtime Environment (JRE) responsible for running Java programs. It acts as an abstract computing machine that enables 
a computer to run Java programs by converting the bytecode (compiled Java code) into machine-specific instructions.
### **Key Features of JVM:**
- **Platform Independence:** JVM allows Java programs to be platform-independent by interpreting bytecode for the specific underlying hardware.
- **Memory Management:** JVM handles memory through the heap, stack, method area, and garbage collection.
- **Performance Optimization:** Just-In-Time (JIT) compilation optimizes the performance of Java programs.
- **Security:** JVM includes security features like bytecode verification and the Security Manager.
## **Components of JVM:**
### **1.Class Loader:**
- Loads .class files into memory.
- Verifies the bytecode and allocates memory.
### **2.Runtime Data Areas:**
- Method Area: Stores class structure like metadata, methods, and constant pool.
- Heap: Holds objects and their data.
- Java Stack: Manages method invocation and execution.
- PC Register: Keeps track of the current instruction.
- Native Method Stack: Supports native method execution.
### **3.Execution Engine:**
- Executes the bytecode.
- Interpreter: Interprets and executes bytecode instructions one at a time.
- JIT Compiler: Compiles bytecode into native code to improve performance.
- Garbage Collector: Automatically manages memory by reclaiming unused objects.

**JVM Workflow:**
- Java source code (.java) is compiled into bytecode (.class).
- Bytecode is loaded into the JVM by the Class Loader.
- The bytecode is verified, and memory is allocated.
- The Execution Engine interprets or compiles the bytecode into machine code.
- Native method libraries are accessed if needed.
- The Garbage Collector manages memory cleanup.

## **JRE - JAVA RUNTIME Environment**
The Java Runtime Environment (JRE) is a part of the Java Development Kit (JDK) that 
provides the runtime environment needed to execute Java applications. It includes the necessary libraries, files, and components to run Java programs.
## **Key Features of JRE:**
- Runtime Environment: Enables the execution of Java applications.
- Pre-Compiled Libraries: Provides standard Java libraries (e.g., java.util, java.io).
- Platform Independence: Facilitates the "write once, run anywhere" principle by running programs on any system with a JRE installed.

## **Components of JRE:**
### **1.JVM (Java Virtual Machine):**
- The core component of JRE.
- Executes the bytecode and provides platform independence.
### **2.Class Libraries:**
- A set of pre-compiled, reusable classes and interfaces.
- Includes essential packages like java.lang, java.util, and java.io.
### **3.Class Loader:**
- Loads classes required for execution into memory.
- Verifies bytecode for security.
### **4.Other Supporting Files:**
- Configuration files, property files, and resource files necessary for runtime.

### **How JRE Works:**
- A compiled Java program (.class file) is passed to the JRE.
- The JVM within the JRE interprets or compiles the bytecode into machine code.
- The Java Class Libraries provide the necessary APIs and utilities to execute the program.
- JRE interacts with the operating system to perform required tasks like file I/O, memory management, and networking.

## **JDK - Java Development Kit**
The Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. It is the full-featured software suite that includes everything 
needed to write, compile, and debug Java applications. The JDK is essential for Java developers.

### **Key Features of JDK:**
-  **1.Development Tools:** Provides tools like the Java compiler (javac), debugger (jdb), and documentation generator (javadoc).
-  **2.Libraries and APIs:** Includes the standard class libraries and APIs required for Java development.
-  **3.Runtime Environment:** Contains the JRE to test and execute Java programs.

### **JDK Workflow:**
- 1- Write Java source code in .java files.
- 2- Use the javac compiler to convert the source code into bytecode (.class files).
- 3- Execute the bytecode using the java launcher, which relies on the JVM provided in the JRE.
- 4- Debug and test applications using tools like jdb.

## **Difference Between JRE, JDK, and JVM:**
- **JDK**	-> Develop and run Java applications	--> Includes : JRE + development tools (compiler, debugger)
- **JRE** ->	Run Java applications	--> Includes : JVM + standard class libraries
- **JVM**	-> Execute Java bytecode--> Includes : 	Execution engine, memory management



# **Object-Oriented Programming System (OOPs)**
in Java is a programming paradigm that uses the concept of "objects" to design and build applications.


- ### **class** :
  in Java ,class is a blueprint or template for creating objects. It defines the properties (fields/attributes) and behaviors (methods) that the objects created from the class will have. A class encapsulates data and methods into a single unit, following the principles of Object-Oriented Programming (OOP).
- ### **An object** :
   in Java, objec is an instance of a class. It represents a real-world entity and has two main characteristics: state (attributes) and behavior (methods). Objects are the fundamental units of Object-Oriented Programming (OOP).
- ### **constructor** :
  is a special method used to initialize objects. It is called when an object is created and is primarily used to set initial values for object attributes.
- **Key Points for constructor:**
- **Same Name as Class:** The constructor must have the same name as the class,
- **No Return Type:** Constructors do not have a return type, not even void & 
- **Invoked Automatically:** A constructor is called automatically when an object is instantiated ,
- **Overloading**: You can have multiple constructors in a class with different parameter lists (constructor overloading).there should be differ in number of arguments or types of arguments must be differ or order of arguments must be different 
- **Implicit this()**: A constructor can call another constructor of the same class using this(),
- **Super Constructor:** The first line of a subclass constructor can call the parent class constructor using super().

```java
class Car {
    // Fields : Data : Data Members : Instance Variables
    String brand;
    int maxSpeed;

    // Constructor
    Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    // Method :Behaviour : member Methods : functions 
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Tesla", 250);
        myCar.displayInfo(); // Accessing the method
    }
}
```
## **Keywords In Java :** 
- **this** :  used to refer to the current instance variable of the class & commonly used to resolve naming conflicts.pass the current instance as a parameter, or invoke other constructors or methods within the same class.
**- Key Uses of this Keyword:** :
- **1.Referencing Current Class Instance Variables:** It is used to resolve ambiguity when instance variables and parameters have the same name.for ex.,
```java
class Employee {
    String name;
    
    Employee(String name) {
        this.name = name; // Resolves conflict between parameter and instance variable
    }
    
    void display() {
        System.out.println("Employee Name: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John");
        emp.display(); // Output: Employee Name: John
    }
}
```
- **2.Calling Another Constructor in the Same Class:**

- Use this() to call another constructor from the same class.
- It must be the first statement in the constructor. for ex .,
```java
class Student {
    String name;
    int age;

    // No-argument constructor
    Student() {
        this("Unknown", 0); // Calls parameterized constructor
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println(name + ", " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display(); // Output: Unknown, 0

        Student student2 = new Student("Alice", 22);
        student2.display(); // Output: Alice, 22
    }
}
```
