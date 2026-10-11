// Q1. Student Record - Class and Object

// Non-public domain class: Student
class Student {
    // Instance variables: each Student object has its own copy
    String name;
    int rollNo;
    double marks;

    // No-argument constructor initializes suitable default values
    Student() {
        name = "Aman Sharma";
        rollNo = 101;
        marks = 85.5;
    }

    // Display logic lives in the class, not in main()
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

// The only public class; it contains main() and matches the file name
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(); // create the object
        student.displayDetails();        // call the class method
    }
}
