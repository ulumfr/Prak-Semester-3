import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    static String NIM;
    static boolean ulang = true;

    static final String code = "10370311";
    //202110370311462
    public static void menu(){
        while(ulang){
            try{
                System.out.print("\nMasukan NIM Anda : ");
                NIM = input.next();

                if(!NIM.contains(code)){
                    throw new Exception("\nNIM Anda Harus Terdapat 10370311 di dalamnya, Coba Lagi !");
                }else if(NIM.length() != 15){
                    throw new Exception("\nNIM Membutuhkan 15 Digit, Coba Lagi !");
                } else {
                    ulang = false;
                }

                System.out.println("\nNIM Terinput : " + NIM);
            }catch(Exception e){
                System.out.println(e + "\n");
            }
        }
    }

    public static void main(String[] args){
        menu();
    }
}
