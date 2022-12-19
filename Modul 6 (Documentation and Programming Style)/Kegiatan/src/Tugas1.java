import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tugas1 {
    String[] inString = {};
    int[] inNumber = {};

    int indexString = 0, indexNumber = 0;
    String tempInput, outputData, dbNumber = "dbNumber.txt", dbString = "dbString.txt";
    char lanjut, pilih;
    boolean valid = true;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Tugas1 tgs1 = new Tugas1();
        try {
            tgs1.menu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void menu() throws IOException {
        System.out.println("===== Inputan Number dan String =====\n");
        System.out.println("##### Database Terkini #####\n");

        try {
            display(dbNumber, "inNumber");
            display(dbString, "inString");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\nInput Data (y/n) ? ");
        pilih = input.next().charAt(0);

        if (pilih == 'y') {
            do {
                System.out.print("\nData (Num/String) : ");
                tempInput = input.next();

                if (cekNum(tempInput)) {
                    inNumber = Arrays.copyOf(inNumber, inNumber.length + 1);
                    inNumber[indexNumber] = Integer.parseInt(tempInput);
                    indexNumber++;
                } else {
                    inString = Arrays.copyOf(inString, inString.length + 1);
                    inString[indexString] = tempInput;
                    indexString++;
                }

                System.out.print("Input Lagi (y/n) ? ");
                lanjut = input.next().charAt(0);

                if (lanjut != 'y') {
                    valid = false;
                }
            } while (valid);
        }

        tambahNumber(inNumber);
        tambahString(inString);

        System.out.println("\n##### Database (Num or Str) #####\n");
        try {
            display(dbNumber, "inNumber");
            display(dbString, "inString");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    boolean cekNum(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    void tambahNumber(int[] num) throws IOException {
        FileWriter fw = new FileWriter(dbNumber, true);

        for (int n : num) {
            fw.write(String.format("%s|\n", n));
        }
        
        fw.flush();
        fw.close();
    }

    void tambahString(String[] str) throws IOException {
        FileWriter fw = new FileWriter(dbString, true);

        for (String s : str) {
            fw.write(String.format("%s|\n", s));
        }

        fw.flush();
        fw.close();
    }

    void display(String dbFile, String category) throws Exception {
        try {
            FileReader fr = new FileReader(dbFile);
            BufferedReader br = new BufferedReader(fr);

            outputData = br.readLine();
            System.out.print(category + " = ");

            do {
                StringTokenizer st = new StringTokenizer(outputData, "|");
                System.out.print(st.nextToken() + " | ");
                outputData = br.readLine();
            } while (outputData != null);

            System.out.print("\n");
            br.close();
            fr.close();
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Database " + category + " Kosong");
        }
    }
}