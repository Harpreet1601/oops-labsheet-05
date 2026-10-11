// Q6. Encapsulated Medicine Product

class MedicineProduct {
    // private = encapsulation: data cannot be touched directly from outside the class
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    // Public getters: controlled read access
    public String getMedicineName() { return medicineName; }
    public String getBatchNo()      { return batchNo; }
    public double getPrice()        { return price; }

    // Public setters: controlled write access
    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }
    public void setBatchNo(String batchNo)           { this.batchNo = batchNo; }
    public void setPrice(double price)               { this.price = price; }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName + " | Batch: " + batchNo + " | Price: " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Ibuprofen", "B3003", 40.0);
        product.displayProduct();

        product.setPrice(45.0); // update through a setter
        System.out.println("Updated price (via getter): " + product.getPrice());
        product.displayProduct();
    }
}
