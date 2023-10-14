import java.util.Scanner;

// Define the BankAccount class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Get the account balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful...! ");
        } else {
            System.out.println("Invalid deposit value...!");
        }
    }

    // Withdraw money from the account
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful...! ");
        } else {
            System.out.println("Amount not available...!");
        }
    }

    public void setInitialBalance(double initialBalance) {
        if (initialBalance >= 1000) {
            balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Please enter a non-negative value.");
        }
    }
}

// Define the ATM class to provide the user interface
class ATM {
    private BankAccount myAccount;

    public ATM(BankAccount account) {
        myAccount = account;
    }

    // Display the main ATM menu
    public void displayMenuBar() {
        System.out.println("ATM Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    // Run the ATM application
    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenuBar();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    myAccount.withdrawal(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Account balance is: " + myAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your initial amount: ");
        double initialBalance = sc.nextDouble();
        if (initialBalance >= 1000) {
            BankAccount myAccount = new BankAccount(initialBalance);

            ATM atm = new ATM(myAccount);
            atm.run();
            sc.close();
        } else {
            System.out.println("initial amount are low..!");
        }
    }
}
