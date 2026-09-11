package id.ac.polinema;
public class Main {
    public static void main(String[] args) {

        //membuat objek account dengan no rekening, nama pemilik, saldo awal, dan batas penarikan harian
        Account limited = new Account("A005", "Fajar", 1000000, 200000);

        // penarikan 300000 melebihi batas penarikan harian, sehingga gagal
        System.out.println("Withdraw 300000 allowed? " + limited.withdraw(300000));
        // penarikan 150000 masih dalam batas penarikan harian, sehingga berhasil
        System.out.println("Withdraw 150000 allowed? " + limited.withdraw(150000) );
        limited.printInfo();
    }
}