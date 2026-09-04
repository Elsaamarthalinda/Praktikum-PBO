public class BotolMinum extends Botol {
    private String jenisMinuman;
    private String warna;

    // Constructor
    public BotolMinum(int kapasitas, String bahan, String jenisMinuman, String warna) {
        super(kapasitas, bahan);
        this.jenisMinuman = jenisMinuman;
        this.warna = warna;
    }

    // Method 1
    public void mengisiMinuman() {
        System.out.println("Botol minum sedang diisi " + jenisMinuman + ".");
    }

    // Method 2
    public void minum() {
        System.out.println("Minuman yang ada di botol sedang diminum.");
    }

    // Method 3
    @Override
    public void cetakInformasi() {
        System.out.println("=== INFORMASI BOTOL MINUM ===");
        System.out.println("Kapasitas     : " + kapasitas + " ml");
        System.out.println("Bahan         : " + bahan);
        System.out.println("Jenis Minuman : " + jenisMinuman);
        System.out.println("Warna         : " + warna);
    }
}