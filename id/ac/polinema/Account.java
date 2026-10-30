package id.ac.polinema;
// Dibuat abstract agar kelas ini hanya menjadi template dan
// tidak bisa dibuat objeknya secara langsung
public abstract class Account {
    private String accountNumber;
    private Customer owner;
    private double balance;
    
// Method abstract: Wajib di-override oleh kelas turunan untuk menghitung biaya bulanan masing-masing
    public abstract double monthlyFee();

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {  //mengambil no rekening
        return accountNumber;
    }

    public Customer getOwner() { //ambil data pemilik rekening
        return owner;
    }

    public double getBalance() { //ambil saldo saat ini
        return balance;
    }

    //Menambah saldo jika nominal setoran lebih dari 0
    public boolean deposit(double amount) { 
        if (amount <= 0) {
            return false; // jika uang jika kurang dari sama dengan 0 maka return false
        }
        balance += amount;
        return true;
    }

    //Memproses penarikan saldo jika memenuhi syarat method canWithdraw()
    //jb 10
   public void withdraw(double amount) throws InsufficientBalanceException {
        if (!canWithdraw(amount)) {
            throw new InsufficientBalanceException(
                accountNumber + ": insufficient balance for  withdrawal of " + amount);
        }
        balance -= amount;
    }

    //Mengecek apakah saldo mencukupi untuk ditarik
    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= balance;
    }

    public boolean deposit(double amount, String note) {
        if (!deposit(amount)) {
            return false;
        }
        System.out.println(accountNumber + " deposit note: " + note);
        return true;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }
}