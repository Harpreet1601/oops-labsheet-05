// Q16. Protected Parent + Private Child Data

// Super class with protected data
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

// Child class 1
class Doctor extends MedicalStaff {
    private String specialization; // private: only Doctor can use it directly

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        // protected fields come from the parent; private field is Doctor's own
        System.out.println("Doctor ID: " + staffId + " | Name: " + staffName
                + " | Specialization: " + specialization);
    }
}

// Child class 2
class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId + " | Name: " + staffName
                + " | License: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");
        Pharmacist pharmacist = new Pharmacist(2, "Neha", "PH-4521");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
