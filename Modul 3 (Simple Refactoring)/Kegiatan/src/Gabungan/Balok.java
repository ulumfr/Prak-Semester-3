package Gabungan;

public class Balok {
    int panjang, lebar, tinggi;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok\t : " + ph.Luas(this) + " cm");
        System.out.println("Hasil Volume Balok\t : " + ph.Volume(this) + " cm^3");
    }

    // Live Demo Refactoring
    static boolean isCube(long input) {
        return (Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input))
                * Math.round(Math.cbrt(input))) == input;
    }

}