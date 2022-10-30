import java.util.Scanner;

public class Driver {
    static int Panjang, Lebar, Tinggi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Balok balok = new Balok();

        System.out.println("=== Menghitung Luas dan Volume Balok ===\n");

        System.out.print("Masukkan Panjang \t: ");
        Panjang = input.nextInt();
        balok.setPanjang(Panjang);

        System.out.print("Masukkan Lebar \t\t: ");
        Lebar = input.nextInt();
        balok.setLebar(Lebar);

        System.out.print("Masukkan Tinggi \t: ");
        Tinggi = input.nextInt();
        balok.setTinggi(Tinggi);

        System.out.println("\n=== Hasil Perhitungan Balok ===\n");
        balok.hasil();
        input.close();

    }
}
