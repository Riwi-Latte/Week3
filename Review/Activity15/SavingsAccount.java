package Review.Activity15;

public class SavingsAccount extends Account {

    public SavingsAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}