public class Kalkulator {
    private String merk;
    private String jenis;

    //Constructor
    public Kalkulator(String merk, String jenis) {
        this.merk = merk;
        this.jenis = jenis;
    }

    //Method 1
    public void menyalakan() {
        System.out.println("Kalkulator sedang dinyalakan.");
    }

    //Method 2
    public void menghapusLayar() {
        System.out.println("Layar kalkulator telah dihapus.");
    }

    //Method 3
    public void cetakInformasi() {
        System.out.println("=== INFORMASI KALKULATOR ===");
        System.out.println("Merk : " + merk);
        System.out.println("Jenis: " + jenis);
    }
}