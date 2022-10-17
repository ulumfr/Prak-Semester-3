import java.util.Scanner;

public class Modul {
    static final String code = "10370311", email = "@webmail.umm.ac.id";
    String pengecekan(String nim) {
        if (nim.length() != 15) {
            return "\nDigit : " + nim.length() + " Digit\nButuh : 15 Digit";
        } else if (!nim.contains(code)) {
            return "\nkode prodi " + code + " not found";
        }
        return nim;
    }

    String pengecekan2(String nama){
        nama = nama.replaceAll("\\d","");
        return nama;
    }

    String pengecekan3(String emails){
        if (!emails.contains(email)) {
            return "\nEmail tidak diketahui" + emails;
        }
        return emails;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Modul tug = new Modul();
        String tempnim,temptelp,nama,emails;
        long NIM,Telp;
        boolean Condition = false;
        /*202110370311471
          wiratama@webmail.umm.ac.id
          82249195890
        */
        do{
            try{
                System.out.print("Masukkan Nama\t : ");
                nama = input.nextLine();
                System.out.print("Masukkan NIM\t : ");
                tempnim = input.nextLine();
                NIM = Long.parseLong(tempnim);
                System.out.print("Masukkan Email\t : ");
                emails = input.nextLine();
                System.out.print("Masukkan No.Telp : ");
                temptelp = input.nextLine();
                Telp = Long.parseLong(temptelp);
                assert tempnim.length() == 15 && tempnim.contains(code) : tug.pengecekan(tempnim);
                assert emails.contains(email) : tug.pengecekan3(email);//Custom Exception
                System.out.println("\n\nNama\t : "+tug.pengecekan2(nama));
                System.out.println("NIM\t\t : "+ NIM);
                System.out.println("Email\t : " + emails);
                System.out.println("No.Telp\t : 0"+Telp);
                Condition = true;
            }catch(NumberFormatException | AssertionError n) {
                System.out.println("\nError : " + n);
            }
        }while(!Condition);
    }
}
