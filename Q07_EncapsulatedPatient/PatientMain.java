// Q7. Encapsulated Patient - Validation

class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() { return patientName; }
    public int getAge()            { return age; }
    public double getWeight()      { return weight; }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // Validation inside the setter: accept only age >= 0
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            System.out.println("Age updated to " + age);
        } else {
            System.out.println("Invalid age rejected: " + age);
        }
    }

    // Validation inside the setter: accept only weight > 0
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
            System.out.println("Weight updated to " + weight);
        } else {
            System.out.println("Invalid weight rejected: " + weight);
        }
    }

    void displayPatient() {
        System.out.println("Patient: " + patientName + " | Age: " + age + " | Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Riya", 25, 55.0);
        patient.displayPatient();

        patient.setAge(26);       // valid
        patient.setAge(-5);       // invalid
        patient.setWeight(58.5);  // valid
        patient.setWeight(0);     // invalid

        patient.displayPatient(); // shows only accepted values
    }
}
