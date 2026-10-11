// Q4. Patient Records - Object Array, Loop and Local Variable

class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + " | Name: " + patientName + " | Age: " + age);
    }
}

// Separate processing class: the loop belongs here, not in main()
class PatientManager {
    void displayAllPatients(Patient[] patients) {
        // 'i' is a local variable: it exists only inside this loop/method
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        // Object array holding five Patient objects
        Patient[] patients = new Patient[5];
        patients[0] = new Patient(1, "Riya", 25);
        patients[1] = new Patient(2, "Karan", 40);
        patients[2] = new Patient(3, "Mohan", 67);
        patients[3] = new Patient(4, "Sita", 12);
        patients[4] = new Patient(5, "Arjun", 33);

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
