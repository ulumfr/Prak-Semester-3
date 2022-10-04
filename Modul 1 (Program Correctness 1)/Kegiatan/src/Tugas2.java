import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    static String NIM;
    static boolean ulang = true;
    
    static final String code = "10370311";
    //202110370311462

    public static void menu1(){
        while(ulang){
            try{
                System.out.print("\nMasukan NIM Anda : ");
                NIM = input.next();

                if(!NIM.contains(code)){
                    throw new Exception("\nNIM Anda Harus Terdapat 10370311 di dalamnya, Coba Lagi !");
                }
                // else if(NIM.length() != 15){
                //     throw new Exception("\nNIM Anda Membutuhkan 15 Angka, Coba Lagi !");}
                //
                else if (NIM.length() > 15) {
                    throw new Exception("\nNIM Anda Melebihi Dari 15 Angka, Coba Lagi !");
                }else if (NIM.length() < 15) {
                    throw new Exception("\nNIM Anda Kurang Dari 15 Angka, Coba Lagi !");
                }
                else {
                    ulang = false;
                }

                System.out.println("\nNIM Terinput : " + NIM);
            }catch(Exception e){
                System.out.println(e + "\n");
            }
        }
    }

    public static void main(String[] args){
        menu1();
    }
}
