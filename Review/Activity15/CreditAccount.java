package Review.Activity15;

public class CreditAccount extends Account {

    public CreditAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -1000) {
            balance -= amount;
            return true;
        }
        return false;
    }
}