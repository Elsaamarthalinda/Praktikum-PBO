package id.ac.polinema;
public class Main {
    public static void main(String[] args) {

        //Customer Nadia memiliki 2 Account
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", customer1, 500000);
        acc1.withdraw(150000); //hasil saldo jadi 350000
        
         Account acc3 = new Account("A003", customer1, 1000000); //Rekening ke 2 Nadia

        //Customer Sari memiliki 1 Account
        Customer customer2 = new Customer("Sari", "0812-000-0002");
        Account acc2 = new Account("A002", customer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.printAllAccounts();

        System.out.println("\n=== Hasil findAccount(\"A002\") ===");
        Account found = bank.findAccount("A002");
        if (found != null) {
            found.printInfo();
        }

        
        // Tugas mandiri: cari semua rekening milik Nadia
        System.out.println("\n=== Hasil findAccountsByOwnerName(\"Nadia\") ===");
        Account[] nadiaAccounts = bank.findAccountsByOwnerName("Nadia");
        System.out.println("Jumlah rekening Nadia: " + nadiaAccounts.length);
        for (Account acc : nadiaAccounts) {
            acc.printInfo();
        }
    }
}