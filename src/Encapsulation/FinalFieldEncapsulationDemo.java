package Encapsulation;

//Fields that cannot be changed after initialization.

class Student {
    private final String studentId;

    // Constructor initializes final field
    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

public class FinalFieldEncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student("S12345");
        System.out.println("Student ID: " + student.getStudentId());
        // Cannot modify studentId as it is final
    }
}
