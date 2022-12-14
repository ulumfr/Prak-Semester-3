import java.util.Arrays;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Comparator;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30));

        data.sort(Comparator.naturalOrder());
        System.out.println("Hasil Sorting\t: " + data);

        ListIterator<Integer> nilai = data.listIterator();

        System.out.print("\nInput Elemen\t: ");
        int elemen = input.nextInt();

        System.out.print("\nIndex dari " + elemen + "\t: ");

        while (nilai.hasNext()) {
            if (nilai.next().equals(elemen)) {
                System.out.print((nilai.nextIndex() - 1) + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
