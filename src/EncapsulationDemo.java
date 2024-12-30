// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a bank account object
        BankAccount account = new BankAccount("Alice", 5000.0, "123456789");

        // Display initial details
        account.displayAccountDetails();

        // Deposit money
        account.deposit(1500);

        // Withdraw money
        account.withdraw(2000);

        // Attempt to withdraw an invalid amount
        account.withdraw(6000);

        // Update account holder's name
        account.setAccountHolderName("Alice Johnson");

        // Display updated details
        account.displayAccountDetails();
    }
}