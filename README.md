# Encapsulation_Demo

This project demonstrates **Encapsulation** in Java with a `BankAccount` class. Encapsulation involves bundling data (fields) and methods that operate on that data into a single unit, while restricting direct access to the fields using access modifiers like `private`.

---

## Key Features
- **Data Hiding**: Fields are private, and access is provided through public getter and setter methods.
- **Control Over Data**: Validations ensure only valid operations are performed (e.g., no negative deposits or withdrawals exceeding balance).
- **Improved Maintainability**: Changes to the internal structure of the class do not affect the external interface.

---

## Code Overview

### 1. `BankAccount` Class
- **Private Fields**:
    - `accountHolderName`: Name of the account holder.
    - `balance`: Current balance of the account.
    - `accountNumber`: Unique account number.
- **Public Methods**:
    - `getAccountHolderName()`, `setAccountHolderName()`: Accessor and mutator for the account holder's name.
    - `deposit(double amount)`: Adds the specified amount to the balance.
    - `withdraw(double amount)`: Subtracts the specified amount if sufficient funds are available.
    - `displayAccountDetails()`: Prints the account details.

### 2. `EncapsulationDemo` Class
- Contains the `main` method, which:
    - Creates a `BankAccount` object with initial values.
    - Demonstrates encapsulated operations like deposit, withdrawal, and field updates.
    - Validates the advantages of controlled data access.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `EncapsulationDemo.java` file.

---

## Sample Output

```plaintext
Account Holder: Alice
Account Number: 123456789
Current Balance: $5000.0
$1500.0 deposited successfully.
$2000.0 withdrawn successfully.
Insufficient funds or invalid withdrawal amount.
Account Holder: Alice Johnson
Account Number: 123456789
Current Balance: $4500.0
