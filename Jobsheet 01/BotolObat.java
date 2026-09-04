public class BotolObat extends Botol {
    private String namaObat;
    private int volumeObat;

    // Constructor
    public BotolObat(int kapasitas, String bahan, String namaObat, int volumeObat) {
        super(kapasitas, bahan);
        this.namaObat = namaObat;
        this.volumeObat = volumeObat;
    }

    // Method 1
    public void menuangkanObat() {
        System.out.println("Obat " + namaObat + " sedang dituangkan.");
    }

    // Method 2
    public void mengocokObat() {
        System.out.println("Botol obat " + namaObat + " sedang dikocok.");
    }

    // Method 3
    @Override
    public void cetakInformasi() {
        System.out.println("=== INFORMASI BOTOL OBAT ===");
        System.out.println("Kapasitas : " + kapasitas + " ml");
        System.out.println("Bahan     : " + bahan);
        System.out.println("Nama Obat : " + namaObat);
        System.out.println("Volume    : " + volumeObat + " ml");
    }
}