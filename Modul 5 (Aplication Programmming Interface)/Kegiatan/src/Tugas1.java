import java.util.Arrays;
import java.util.Scanner;

//Full Method
public class Tugas1 {
    int[] data;

    public Tugas1(int[] data) {
        this.data = data;
    }
    
    public void Display() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Mengurutkan Data (Tanpa API) ===\n");
        System.out.println("Total Data\t: " + data.length);
        System.out.println("\nData Awal\t: " + Arrays.toString(data));
        System.out.println("\nHasil Sorting\t: " + Arrays.toString(Sorting(data)));

        System.out.print("\nInput Elemen\t: ");
        int cari = input.nextInt();

        System.out.print("\nIndex dari " + cari + "\t: ");
        Search(cari);
        input.close();
    }

    public int[] Sorting(int[] data) {
        for (int index = 0; index < data.length; index++) {
            for (int elemen = index + 1; elemen < data.length; elemen++) {
                if (data[elemen] < data[index]) {
                    int temp = data[index];
                    data[index] = data[elemen];
                    data[elemen] = temp;
                }
            }
        }
        return data;
    }

    public void Search(int input) {
        int i = 0;
        boolean empty = true;

        while (i < data.length) {
            if (data[i] == input) {
                String view = Integer.toString(i);
                System.out.print(view + " ");
                empty = false;
            }
            i++;
        }
        if (empty) {
            System.out.println("Index tidak ditemukan!!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = new int[] { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        Tugas1 tugas1 = new Tugas1(data);
        tugas1.Display();
    }
}
