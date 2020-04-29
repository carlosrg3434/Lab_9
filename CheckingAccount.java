public class CheckingAccount extends BankAccount {
    public static double fee= .15;

    public CheckingAccount(String name, int initialAmount) {
        super(name, initialAmount);
        super.setAccountNumber(super.getAccountNumber() + "-10");
    }

    public boolean withdraw(double amount) {
        return super.withdraw(amount+fee);
    }
}