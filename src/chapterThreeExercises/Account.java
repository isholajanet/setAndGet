package chapterThreeExercises;

public class Account {
    private double accountBalance;
    private String accountName;
    private final int accountNumber;
    int counter = 0;

    public Account(String accountName, double accountBalance) {
        counter ++;
        accountNumber = counter;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Account() {
        counter++;
        accountNumber = counter;
    }

    public String getName() {
        return accountName;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0){
        accountBalance = accountBalance + depositAmount;}
        else
            System.out.println("Deposit amount is too low");
    }

    public double getBalance() {
        return accountBalance;
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 1 && withdrawAmount < accountBalance) {
            accountBalance = accountBalance - withdrawAmount;
        }
        else
            System.out.println("Check withdraw amount and try again");
    }

    public void transfer(int transferAmount, Account otherAccount) {
            Account receivingAccount = otherAccount;
            withdraw(transferAmount);
            receivingAccount.deposit(transferAmount);
        }

    public int getAccountNumber() {
        return accountNumber;
    }
}