package Gabungan;

import java.util.Scanner;

public class Driver {
    static int Panjang, Lebar, Tinggi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Balok balok = new Balok();
        Perhitungan hitung = new Perhitungan();

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

        System.out.println("\n=== Hasil Perhitungan ===\n");
        balok.hasil();

        System.out.println("\n=== Cube Tugas 3 ===");
        System.out.println("\nBalok is " + balok.isCube(hitung.Luas(balok)) + "\n");

        input.close();
    }
}