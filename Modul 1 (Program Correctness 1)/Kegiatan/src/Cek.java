import java.util.Scanner;

public class Cek {
    static final String code = "10370311";

    public static String pengecekan(String nim) {
        if (nim.length() != 15) {
            return "\nDigit : " + nim.length() + " Digit\nButuh : 15 Digit";
        } else if (!nim.contains(code)) {
            return "\nkode prodi " + code + " not found";
        }
        return nim;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim;
        long NIM;
        boolean Condition = false;
        //202110370311462
        do{
            try{
                System.out.print("\nMasukkan NIM anda: ");
                nim = input.nextLine();
                NIM = Long.parseLong(nim);
                assert nim.length() == 15 && nim.contains(code) : pengecekan(nim); //statement asumsi
                System.out.println("NIM anda : "+ NIM+"\n");
                Condition = true;
                input.close();
            }catch(NumberFormatException | AssertionError n) {
                System.out.println("\nError : " + n);
            }
        }while(!Condition);
    }
    
}
