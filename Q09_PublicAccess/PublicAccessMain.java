// Q9. Public Access Specifier

class Hospital {
    // public: these members can be accessed from any class, directly
    public String hospitalName;
    public String hospitalCode;

    // public no-argument constructor
    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "CH-01";
    }

    // public method: callable from any class
    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + " | Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Direct access to public members is allowed
        System.out.println("Name (direct access): " + hospital.hospitalName);
        System.out.println("Code (direct access): " + hospital.hospitalCode);

        hospital.displayHospital();
    }
}
