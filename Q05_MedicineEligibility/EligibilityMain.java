// Q5. Medicine Eligibility - Method and Local Variable

class Medicine {
    String medicineName;
    int ageLimit; // minimum age required to use the medicine

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    // Method that decides eligibility and returns the result
    String checkEligibility(int patientAge) {
        String result; // local variable: lives only inside this method
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Cough Syrup", 18);

        // main() only calls the method; the comparison is inside checkEligibility()
        System.out.println(medicine.medicineName + " for age 25: " + medicine.checkEligibility(25));
        System.out.println(medicine.medicineName + " for age 12: " + medicine.checkEligibility(12));
    }
}
