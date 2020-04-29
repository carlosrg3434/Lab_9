public class AccountDriver
{
    public static void main(String[] args)
    {
        double deposite = 500;
        double withdraw = 1000;

        String money;
        String moneyDeposited;
        String moneyWithdraw;
        boolean completed;

        CheckingAccount myCheckingAccount =
                new CheckingAccount("Benjamin Franklin", 1000);

        System.out.println("Account Number " +
                myCheckingAccount.
                        getAccountNumber() +
                " belonging to " +
                myCheckingAccount.getOwner());

        money = String.format("%.2f",
                myCheckingAccount.
                        getBalance());

        System.out.println("Initial balance = $" + money);

        myCheckingAccount.deposit(deposite);

        moneyDeposited = String.format("%.2f", deposite);

        money = String.format("%.2f",
                myCheckingAccount.
                        getBalance());

        System.out.println("After deposite of $" +
                moneyDeposited + ", balance = $" +
                money);

        completed = myCheckingAccount.withdraw(withdraw);

        moneyWithdraw = String.format("%.2f", withdraw);

        money = String.format("%.2f",
                myCheckingAccount.
                        getBalance());

        if (completed)
        {
            System.out.println("After withdrawal of $" +
                    moneyWithdraw + ", balance = $" +
                    money);
        }
        else
        {
            System.out.println("Insuffient funds to " +
                    "withdraw $" + moneyWithdraw +
                    ", balance = $" + money);
        }

        System.out.println();

        // Test the SavingsAccount class.
        SavingsAccount yourAccount =
                new SavingsAccount("William Shakespeare", 400);

        System.out.println("Account Number " +
                yourAccount.getAccountNumber() +
                " belonging to " +
                yourAccount.getOwner());

        money = String.format("%.2f",
                yourAccount.getBalance());

        System.out.println("Initial balance = $" + money);

        yourAccount.deposit(deposite);

        moneyDeposited = String.format("%.2f", deposite);

        money = String.format("%.2f",
                yourAccount.getBalance());

        System.out.println("After deposite of $" +
                moneyDeposited + ", balance = $" +
                money);

        completed = yourAccount.withdraw(withdraw);

        moneyWithdraw = String.format("%.2f", withdraw);

        money = String.format("%.2f",
                yourAccount.getBalance());

        if (completed)
        {
            System.out.println("After withdrawal of $" +
                    moneyWithdraw + ", balance = $" +
                    money);
        }
        else
        {
            System.out.println("Insuffient funds " +
                    "to withdraw $" + moneyWithdraw +
                    ", balance = $" + money);
        }

        yourAccount.postInterest();

        money = String.format("%.2f",
                yourAccount.getBalance());

        System.out.println("After monthly interest " +
                "has been posted," +
                "balance = $" + money);

        System.out.println();

        SavingsAccount secondAccount =
                new SavingsAccount(yourAccount, 5);

        System.out.println("Account Number " +
                secondAccount.
                        getAccountNumber() +
                " belonging to " +
                secondAccount.getOwner());

        money = String.format("%.2f",
                secondAccount.getBalance());

        System.out.println("Initial balance = $" + money);

        secondAccount.deposit(deposite);

        moneyDeposited = String.format("%.2f", deposite);

        money = String.format("%.2f",
                secondAccount.getBalance());

        System.out.println("After deposite of $" + moneyDeposited +
                ", balance = $" + money);

        secondAccount.withdraw(withdraw);

        moneyWithdraw = String.format("%.2f", withdraw);

        money = String.format("%.2f",
                secondAccount.getBalance());

        if (completed)
        {
            System.out.println("After withdrawal of $" +
                    moneyWithdraw + ", balance = $" +
                    money);
        }
        else
        {
            System.out.println("Insuffient funds " +
                    "to withdraw $" + moneyWithdraw +
                    ", balance = $" + money);
        }

        System.out.println();

        CheckingAccount yourCheckingAccount =
                new CheckingAccount("Issac Newton", 5000);

        System.out.println("Account Number " +
                yourCheckingAccount.
                        getAccountNumber() +
                " belonging to " +
                yourCheckingAccount.getOwner());
    }
}