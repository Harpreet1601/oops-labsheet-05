// Q11. Default Access Specifier

class Pharmacy {
    // Default (package-private) instance variables: no access keyword
    String medicineName;
    double price;

    // Default (package-private) constructor
    Pharmacy() {
        medicineName = "Paracetamol";
        price = 25.5;
    }

    // Default (package-private) method
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + " | Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Allowed because both classes are in the same package (same file/folder here)
        System.out.println("Direct access: " + pharmacy.medicineName + " costs " + pharmacy.price);
        pharmacy.displayMedicine();
    }
}
