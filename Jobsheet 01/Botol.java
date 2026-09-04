public class Botol {
    protected int kapasitas;
    protected String bahan;

    // Constructor
    public Botol(int kapasitas, String bahan) {
        this.kapasitas = kapasitas;
        this.bahan = bahan;
    }

    // Method 1
    public void membuka() {
        System.out.println("Botol dibuka.");
    }

    // Method 2
    public void menutup() {
        System.out.println("Botol ditutup.");
    }

    // Method 3
    public void cetakInformasi() {
        System.out.println("=== INFORMASI BOTOL ===");
        System.out.println("Kapasitas : " + kapasitas + " ml");
        System.out.println("Bahan     : " + bahan);
    }
}