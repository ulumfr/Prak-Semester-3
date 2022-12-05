import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        float positif = 0, zero = 0, negatif = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("===== Menghitung Elemen Rasio (Data Tugas 1) =====\n");
        System.out.print("Size\t\t: ");
        int[] size = new int[Integer.parseInt(input.nextLine())];

        System.out.print("\nInput Data\t: ");
        String[] data = input.nextLine().split(" ");

        System.out.print("\nResult\t\t: ");
        for (int i = 0; i < data.length; i++) {
            size[i] = Integer.parseInt(data[i]);
            if (size[i] < 0) {
                negatif++;
            } else if (size[i] == 0) {
                zero++;
            } else if (size[i] > 0) {
                positif++;
            }
        }
        input.close();

        Arrays.sort(size);
        System.out.println(Arrays.toString(size));

        System.out.println("\n=== Tampilan Nilai Rasio ===");
        System.out.printf("\nPositif\t\t: %.2f\n", positif / size.length);
        System.out.printf("Negatif\t\t: %.2f\n", negatif / size.length);
        System.out.printf("Zero\t\t: %.2f\n", zero / size.length);

    }
}
