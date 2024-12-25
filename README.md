 # **JVM JDK &  JVM**

 **JVM - JAVA VIRTUAL MACHINE :** Like name suggest it is virutal machine , The Java Virtual Machine (JVM) is a crucial part of the Java Runtime Environment (JRE) responsible for running Java programs. It acts as an abstract computing machine that enables 
a computer to run Java programs by converting the bytecode (compiled Java code) into machine-specific instructions.
### **Key Features of JVM:**
Platform Independence: JVM allows Java programs to be platform-independent by interpreting bytecode for the specific underlying hardware.
Memory Management: JVM handles memory through the heap, stack, method area, and garbage collection.
Performance Optimization: Just-In-Time (JIT) compilation optimizes the performance of Java programs.
Security: JVM includes security features like bytecode verification and the Security Manager.
**Components of JVM:**
**1 - Class Loader:**
- Loads .class files into memory.
- Verifies the bytecode and allocates memory.
**2 - Runtime Data Areas:**
- Method Area: Stores class structure like metadata, methods, and constant pool.
- Heap: Holds objects and their data.
- Java Stack: Manages method invocation and execution.
- PC Register: Keeps track of the current instruction.
- Native Method Stack: Supports native method execution.
**3 - Execution Engine:**
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

**JRE - JAVA RUNTIME Environment**
The Java Runtime Environment (JRE) is a part of the Java Development Kit (JDK) that 
provides the runtime environment needed to execute Java applications. It includes the necessary libraries, files, and components to run Java programs.
**Key Features of JRE:**
- Runtime Environment: Enables the execution of Java applications.
- Pre-Compiled Libraries: Provides standard Java libraries (e.g., java.util, java.io).
- Platform Independence: Facilitates the "write once, run anywhere" principle by running programs on any system with a JRE installed.

**Components of JRE:**
**1- JVM (Java Virtual Machine):**
- The core component of JRE.
- Executes the bytecode and provides platform independence.
**2 - Class Libraries:**
- A set of pre-compiled, reusable classes and interfaces.
- Includes essential packages like java.lang, java.util, and java.io.
**3 - Class Loader:**
- Loads classes required for execution into memory.
- Verifies bytecode for security.
**4 - Other Supporting Files:**
- Configuration files, property files, and resource files necessary for runtime.

**How JRE Works:**
- A compiled Java program (.class file) is passed to the JRE.
- The JVM within the JRE interprets or compiles the bytecode into machine code.
- The Java Class Libraries provide the necessary APIs and utilities to execute the program.
- JRE interacts with the operating system to perform required tasks like file I/O, memory management, and networking.

**JDK - Java Development Kit**
The Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. It is the full-featured software suite that includes everything 
needed to write, compile, and debug Java applications. The JDK is essential for Java developers.

**Key Features of JDK:**
**1- Development Tools:** Provides tools like the Java compiler (javac), debugger (jdb), and documentation generator (javadoc).
**2- Libraries and APIs:** Includes the standard class libraries and APIs required for Java development.
**3- Runtime Environment:** Contains the JRE to test and execute Java programs.

**JDK Workflow:**
1- Write Java source code in .java files.
2- Use the javac compiler to convert the source code into bytecode (.class files).
3- Execute the bytecode using the java launcher, which relies on the JVM provided in the JRE.
4- Debug and test applications using tools like jdb.

**Difference Between JRE, JDK, and JVM:**
JDK	-> Develop and run Java applications	--> Includes : JRE + development tools (compiler, debugger)
JRE ->	Run Java applications	--> Includes : JVM + standard class libraries
JVM	-> Execute Java bytecode--> Includes : 	Execution engine, memory management



-***************************************Object-Oriented Programming System (OOPs)********************************************
in Java is a programming paradigm that uses the concept of "objects" to design and build applications.


-**class** in Java is a blueprint or template for creating objects. It defines the properties (fields/attributes) and behaviors (methods) that the objects created from the class will have. A class encapsulates data and methods into a single unit, following the principles of Object-Oriented Programming (OOP).**An object** in Java is an instance of a class. It represents a real-world entity and has two main characteristics: state (attributes) and behavior (methods). Objects are the fundamental units of Object-Oriented Programming (OOP).

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

