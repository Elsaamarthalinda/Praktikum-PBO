package id.ac.polinema;

/** FUNGSI: Sebagai kontrak untuk objek yang membutuhkan jejak/catatan audit sistem log.
 * KELAS YANG MENGGUNAKAN: CheckingAccount
 */
public interface Auditable {
    /**
     * Deklarasi method abstrak untuk mengambil data teks log audit.
     * @return String berupa informasi rekaman transaksi/rekening.
     */
    String auditLog();
}
