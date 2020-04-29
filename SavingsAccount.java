public class SavingsAccount extends BankAccount{
    private double rate = .025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = super.getAccountNumber()+ "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount old, double balance) {
        super(old,balance);
        savingsNumber = old.savingsNumber +1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double newBalance= getBalance()*(1+rate/12);
        setBalance(newBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}