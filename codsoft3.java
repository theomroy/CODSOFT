import java.util.*;

class Account {
    private double balance;

    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class codsoft3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1000.0); // starting balance
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> acc.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                }
                case 4 -> System.out.println("Thank you for using the ATM!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

