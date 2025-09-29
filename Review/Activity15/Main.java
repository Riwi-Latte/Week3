package Review.Activity15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV001", 1000));
        accounts.add(new SavingsAccount("SAV002", 500));
        accounts.add(new CreditAccount("CRE001", 200));
        accounts.add(new CreditAccount("CRE002", -300));

        System.out.println("=== Initial Account States ===");
        for (Account account : accounts) {
            System.out.println(account);
        }

        System.out.println("\n=== Testing Withdrawals ===");

        System.out.println("\nTesting SavingsAccount withdrawals:");
        testWithdraw(accounts.get(0), 500);
        testWithdraw(accounts.get(0), 600);

        System.out.println("\nTesting CreditAccount withdrawals:");
        testWithdraw(accounts.get(2), 300);
        testWithdraw(accounts.get(2), 1000);

        System.out.println("\n=== Final Account States ===");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    private static void testWithdraw(Account account, double amount) {
        System.out.println("Attempting to withdraw $" + amount + " from " + account.number);
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("Withdrawal successful. New balance: $" + account.balance);
        } else {
            System.out.println("Withdrawal failed. Balance remains: $" + account.balance);
        }
    }
}
