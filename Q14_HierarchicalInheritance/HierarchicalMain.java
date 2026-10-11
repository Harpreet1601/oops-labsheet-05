// Q14. Hierarchical Inheritance - Person -> Doctor and Nurse

// Person is the SUPER class for both children
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// Doctor is CHILD class 1
class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Role: Doctor | Specialization: " + specialization);
    }
}

// Nurse is CHILD class 2
class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Role: Nurse | Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Sharma", 42, "Cardiology");
        Nurse nurse = new Nurse("Anita", 30, "Ward 5");
        doctor.displayDoctor();
        System.out.println();
        nurse.displayNurse();
    }
}
