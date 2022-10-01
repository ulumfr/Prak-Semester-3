import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    static String NIM;
    static boolean ulang = true;
    //202110370311462
    public static void menu(){
        while(ulang){
            try{
                System.out.print("Masukan NIM Anda : ");
                NIM = input.next();

                if(!NIM.contains("10370311")){
                    throw new Exception("NIM Anda Harus Terdapat 10370311 di dalamnya, Coba Lagi");
                }else if(NIM.length() > 15){
                    throw new Exception("NIM lebih dari 15, Coba Lagi");
                }else if (NIM.length() < 15){
                    throw new Exception("NIM kurang dari 15, Coba Lagi");
                } else {
                    ulang = false;
                }

                System.out.println("NIM Terinput");
            }catch(Exception e){
                System.out.println(e + "\n");
            }
        }
    }

    public static void main(String[] args){
        menu();
    }
}
