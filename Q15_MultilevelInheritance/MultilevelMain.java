// Q15. Multilevel Inheritance - Person -> Employee -> Manager

// Level 1: Person is the TOP-LEVEL super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Level 2: Employee is a CHILD of Person and the INTERMEDIATE super class of Manager
class Employee extends Person {
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    protected int getEmployeeId() {
        return employeeId; // private in Employee, so Manager uses this getter
    }
}

// Level 3: Manager is the FINAL child class
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId); // passes data up the chain
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name      : " + name);          // from Person
        System.out.println("Age       : " + age);           // from Person
        System.out.println("Employee ID: " + getEmployeeId()); // from Employee
        System.out.println("Team Size : " + teamSize);      // Manager's own
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Anita", 45, 501, 12);
        manager.displayManager();
    }
}
