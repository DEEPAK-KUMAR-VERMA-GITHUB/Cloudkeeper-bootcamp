package combined.mini_banking;

import java.util.HashMap;

public class BankAccount {
    private static HashMap<Integer, BankAccount> accounts;
    private int accountNumber;
    private double balance;
    private String consumerName;
    private static int nextAccountNumber;

    static {
        accounts = new HashMap<>();
        nextAccountNumber = 1;
    }

    public BankAccount(String consumerName) {
        this.accountNumber = nextAccountNumber++;
        this.consumerName = consumerName;
        balance = 0.0;
        accounts.put(this.accountNumber, this);
    }

    public double getBalance() {
        return this.balance;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be a valid number.");
        }
        balance += amount;
        System.out.printf("Deposited : Rs. %.0f successfully.\nCurrent balance : Rs. %.0f\n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be a valid number.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance. Try again...!");
        }
        balance -= amount;
        System.out.printf("Withdrew : Rs. %.0f.\nCurrent balance : Rs. %.0f\n", amount, balance);
    }

    @Override
    public String toString() {
        return String.format("BankAccount {accountNumber=%d, consumerName='%s', balance=Rs. %.0f}\n",
                accountNumber, consumerName, balance);
    }
}
