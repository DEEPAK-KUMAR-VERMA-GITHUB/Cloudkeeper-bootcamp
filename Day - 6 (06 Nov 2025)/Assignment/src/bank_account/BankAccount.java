package bank_account;

import java.util.HashMap;
import java.util.HashSet;

public class BankAccount {
    private static HashMap<Long, BankAccount> accountsInfo = new HashMap<>();

    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName) {
        if (accountsInfo.containsKey(accountNumber)) {
            throw new DuplicateAccountException("Account already present for number: " + accountNumber);
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
        accountsInfo.put(accountNumber, this);
    }

    public BankAccount(long accountNumber, String holderName, double balance) {
        if (accountsInfo.containsKey(accountNumber)) {
            throw new DuplicateAccountException("Account already present for number: " + accountNumber);
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        accountsInfo.put(accountNumber, this);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
