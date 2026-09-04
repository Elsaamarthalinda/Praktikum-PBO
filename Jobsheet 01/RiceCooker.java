public class RiceCooker {
    private String merk;
    private int kapasitas;

    // Constructor
    public RiceCooker(String merk, int kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }

    // Method 1
    public void memasakNasi() {
        System.out.println("Rice cooker " + merk + " berfungsi memasak nasi.");
    }

    // Method 2
    public void menghangatkanNasi() {
        System.out.println("Rice cooker " + merk + " untuk menghangatkan nasi.");
    }

    // Method 3
    public void cetakInformasi() {
        System.out.println("=== INFORMASI RICE COOKER ===");
        System.out.println("Merk      : " + merk);
        System.out.println("Kapasitas : " + kapasitas + " liter");
    }
}