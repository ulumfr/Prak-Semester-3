public class Perhitungan {
    Balok sisi = new Balok();
    int luas,volume;

    void perhitungan(){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        luas(panjang, lebar, tinggi);

        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        volume(panjangV, lebarV, tinggiV);

//      Before Recatoring Extract Method :
//      luas = panjang * lebar * tinggi;
//      volume = 4 * panjangV * lebarV * tinggiV;
    }

    //  After Refactoring :
    public int volume(int panjangV, int lebarV, int tinggiV) {

        return volume = 4 * panjangV * lebarV * tinggiV;
    }

    public int luas(int panjang, int lebar, int tinggi) {

        return luas = panjang * lebar * tinggi;
    }
}
