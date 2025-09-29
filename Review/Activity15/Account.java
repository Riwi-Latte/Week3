package Review.Activity15;

public abstract class Account {
    String number;
    double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public String toString() {
        return "Account{number='" + number + "', balance=" + balance + "}";
    }
}