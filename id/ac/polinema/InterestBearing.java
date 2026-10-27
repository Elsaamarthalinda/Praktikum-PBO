package id.ac.polinema;

/**
 * INTERFACE: InterestBearing
 * FUNGSI: Sebagai kontrak untuk semua tipe rekening yang memiliki fitur perhitungan bunga.
 * KELAS YANG MENGGUNAKAN: SavingsAccount
 */
public interface InterestBearing {
    /**
     * Debris/Deklarasi method abstrak untuk menerapkan bunga ke saldo.
     * Kelas yang meng-implements interface ini WAJIB memberikan isi logika untuk method ini.
     */
    void applyInterest();
    
}
