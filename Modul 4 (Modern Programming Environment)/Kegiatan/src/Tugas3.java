import java.util.Scanner;

// Sudah JADI 
public class Tugas3 {

    static int[] hari = new int[3];

    public static void main(String[] args) {
        int bulan, tahun;

        Scanner input = new Scanner(System.in);

        System.out.println("\n===== Modul 4 Proglanjut ====");
        System.out.println("======= Konversi Hari =======\n");

        System.out.print("Jumlah Hari : ");
        hari[0] = input.nextInt();

        setHari(getHari());
        tahun = konversi(getHari(), 0, 365);
        bulan = konversi(getHari(), 1, 30);

        System.out.println(hari[0] + " Hari = " + tahun + " Tahun " + bulan + " Bulan " + hari[2] + " Hari");
        input.close();
    }

    private static int konversi(int[] hari, int x, int x2) {
        int konversi_hari = hari[x] / x2;
        hari[x + 1] = hari[x] % x2;
        return konversi_hari;
    }

    private static int[] getHari() {
        return hari;
    }

    private static void setHari(int[] hari) {
        Tugas3.hari = hari;
    }
}


// Belum Jadi
//public class Tugas3 {
//
//    static int[] hari = new int[3];
//
//    public static void main(String[] args) {
//        int bulan, tahun;
//
//        Scanner input = new Scanner(System.in);
//
//        //Judul
//
//
//        //Input Konversi
//
//
//        hari[1] = hari[0];
//
//        //Rumus Konversi
//
//
//        //Output Konversi
//
//        input.close();
//    }
//
////    private static int[] getHari() {
////        return hari;
////    }
//}