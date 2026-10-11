// Q3. Pharmacy - Instance and Class Variables

class Pharmacy {
    // Instance variables: separate for every Pharmacy object
    String pharmacyName;
    String location;

    // Class variable (static): ONE copy shared by all Pharmacy objects
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++; // every new object increases the shared count
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName + " | Location: " + location);
    }

    // Static method to show the shared class variable
    static void displayPharmacyCount() {
        System.out.println("Total pharmacies created: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Haridwar");
        Pharmacy p2 = new Pharmacy("Health Plus", "Dehradun");
        Pharmacy p3 = new Pharmacy("Care Medico", "Rishikesh");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
