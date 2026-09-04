public class Demo {
    public static void main(String[] args) {

        //INSTANSIASI OBJECT
        BotolMinum botolMinum = new BotolMinum(
                600,
                "Plastik",
                "Air Putih",
                "Biru"
        );

        BotolObat botolObat = new BotolObat(
                100,
                "Plastik",
                "OBH Combi",
                100
        );

        RiceCooker riceCooker = new RiceCooker(
                "HAN RIVER",
                1
        );

        Kalkulator kalkulator = new Kalkulator(
                "JOYKO",
                "Scientific"
        );

        //OBJECT BOTOL MINUM
        System.out.println("\n---------------------------------");
        botolMinum.cetakInformasi();
        botolMinum.membuka();
        botolMinum.mengisiMinuman();
        botolMinum.minum();
        botolMinum.menutup();


        // OBJECT BOTOL OBAT
        System.out.println("\n---------------------------------");
        botolObat.cetakInformasi();
        botolObat.membuka();
        botolObat.menuangkanObat();
        botolObat.mengocokObat();
        botolObat.menutup();

        // OBJECT RICE COOKER
        System.out.println("\n---------------------------------");
        riceCooker.cetakInformasi();
        riceCooker.memasakNasi();
        riceCooker.menghangatkanNasi();

        // OBJECT KALKULATOR
        System.out.println("\n---------------------------------");
        kalkulator.cetakInformasi();
        kalkulator.menyalakan();
        kalkulator.menghapusLayar();
    }
}