// Q10. Private Access Specifier

class Employee {
    // private: accessible only inside the Employee class
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Public getters give controlled read access to private data
    public int getEmployeeId()       { return employeeId; }
    public String getEmployeeName()  { return employeeName; }
    public double getSalary()        { return salary; }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Neha", 45000);

        // Direct access is NOT allowed - this would be a compile error:
        // System.out.println(employee.salary);

        // Allowed: access through public getters
        System.out.println("ID     : " + employee.getEmployeeId());
        System.out.println("Name   : " + employee.getEmployeeName());
        System.out.println("Salary : " + employee.getSalary());

        employee.displayEmployee();
    }
}
