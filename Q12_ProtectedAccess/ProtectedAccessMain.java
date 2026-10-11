// Q12. Protected Access Specifier

// Super class
class HospitalStaff {
    // protected: accessible in the same package and in child classes
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId + " | Staff Name: " + staffName);
    }
}

// Child class
class Pharmacist extends HospitalStaff {
    private String licenseNo; // child's own private data

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName); // initialize the super class part
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        // Inherited protected members are used directly in the child class
        System.out.println("Pharmacist " + staffName + " has ID " + staffId);
        displayStaff();
        System.out.println("License No: " + licenseNo);
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(201, "Neha", "PH-4521");
        pharmacist.displayPharmacist();
    }
}
