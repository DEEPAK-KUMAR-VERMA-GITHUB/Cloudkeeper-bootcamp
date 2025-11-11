package combined.mini_banking;

public class BankAccountMain {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("Aman");
            account1.deposit(500);
            account1.withdraw(200);
            System.out.println(account1);
        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }
    }
}
