public class Aksi_MobilSport {
    public static void main(String[] s) {
        // Pembuat Object
        MobilSport Sport = new MobilSport();
        MobilSport Standart = new MobilSport();

        // Memanggil Attribut dan nilai
        Sport.warna = "Hitam";
        Sport.PlatNomor = "H 111 S";
        Standart.warna = "Putih";
        Standart.PlatNomor = "H 4 HA";

        System.out.println("Sport warna = " + Sport.warna);
        System.out.println("Sport Plat = " + Sport.PlatNomor);

        System.out.println("Standart warna = " + Standart.warna);
        System.out.println("Standart Plat = " + Standart.PlatNomor);

    }
}