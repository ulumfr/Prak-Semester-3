import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        float positif = 0, zero = 0, negatif = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Menghitung Elemen Rasio (Data Tugas 1) =====\n");
        System.out.print("Size\t\t: ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("\nInput Data\t: ");
        String data = input.nextLine();

        String[] splitArr = data.split(" ");
        int[] hasil = new int[size];

        System.out.print("\nResult\t\t: ");
        for (int i = 0; i < splitArr.length; i++) {
            hasil[i] = Integer.parseInt(splitArr[i]);
            if (hasil[i] < 0){
                negatif++;
            } else if (hasil[i] == 0){
                zero++;
            } else if (hasil[i] > 0) {
                positif++;
            }
        }
        input.close();

        Arrays.sort(hasil);
        System.out.println(Arrays.toString(hasil));

        System.out.println("\n=== Tampilan Nilai Rasio ===");
        System.out.printf("\nPositif\t\t: %.2f\n", positif/size);
        System.out.printf("Zero\t\t: %.2f\n", zero/size);
        System.out.printf("Negatif\t\t: %.2f\n", negatif/size);

    }
}
