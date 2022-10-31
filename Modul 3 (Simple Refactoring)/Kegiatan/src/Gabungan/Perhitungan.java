package Gabungan;

public class Perhitungan {
    Balok sisi = new Balok();
    
    // Before Refactoring
    // void perhitungan() {
        // int panjang = sisi.getPanjang();
        // int lebar = sisi.getLebar();
        // int tinggi = sisi.getTinggi();
        // Luas(panjang, lebar, tinggi);

        // int panjangV = sisi.getPanjang();
        // int lebarV = sisi.getLebar();
        // int tinggiV = sisi.getTinggi();
        // Volume(panjangV, lebarV, tinggiV);
    // }


    // After Refactoring
    long Luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi(); ///inline temp
    }

    long Volume(Balok sisi) {
        return 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

}