// Q8. Bank Account - Encapsulation, this and Local Variable

class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        boolean success; // local variable tracking whether the withdrawal worked
        if (amount > balance) {
            success = false; // insufficient balance: withdrawal fails
        } else {
            balance = balance - amount;
            success = true;
        }

        if (success) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed: insufficient balance for " + amount);
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo + " | Holder: " + accountHolderName
                + " | Balance: " + getBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aman Sharma", 5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(10000); // fails: more than balance
        account.displayAccount();
    }
}
