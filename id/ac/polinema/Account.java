package id.ac.polinema;
public class Account {

    //private membuat atribut hanya dapat diakses  didalam class account
    private String accountNumber;
    private String ownerName;
    private double balance;
    private double dailyWithdrawalLimit; //modif tugas mandiri

    //modif tugas mandiri
    public Account(String accountNumber, String ownerName, double balance, double dailyWithdrawalLimit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) { // jika uang jika kurang dari sama dengan 0 maka return false
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

   public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance || amount > dailyWithdrawalLimit) { //modif tugas mandiri
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + ownerName + " - balance: " + balance);
    }
}