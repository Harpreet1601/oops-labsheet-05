// Q13. Single Inheritance - Employee -> Pharmacist

// Employee is the SUPER class
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Salary     : " + salary);
    }
}

// Pharmacist is the CHILD class (inherits from Employee)
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary); // initializes the super class part
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee(); // inherited method from the super class
        System.out.println("License No : " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(301, "Neha", 40000, "PH-4521");
        pharmacist.displayPharmacist();
    }
}
