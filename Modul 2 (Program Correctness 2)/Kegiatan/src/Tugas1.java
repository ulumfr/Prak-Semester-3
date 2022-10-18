import java.util.*;

public class Tugas1 {
    static final String code = "10370311", domain = "@webmail.umm.ac.id";

    String cek(String nim) {
        if (nim.length() != 15) {
            return "NIM anda harus berjumlah 15 digits!";
        } else if (!nim.contains(code)) {
            return "NIM anda harus terdapat 10370311";
        }
        return nim;
    }

    String cek2(String email) {
        if(!email.contains(domain)){
            return "Email UMM anda harus terdapat domain @webmail.umm.ac.id";
        }
        return email;
    }

    String cek3(String name){
        if(!name.matches("^[ A-zA-Z]+$")){
            return "Nama anda harus alfabet saja";
        }
        return name;
    }

    String cek4(String telp){
        if(!telp.contains("62")){
            return "Nomer anda harus diawali dengan 62";
        }
        return telp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tugas1 pengecekan = new Tugas1();
        boolean correct = false;
        String name, email, NIM, telp;

        while(!correct){
            try{
                System.out.printf("Masukan Nama\t: ");
                name = input.nextLine();

                System.out.printf("Masukan NIM\t: ");
                NIM = input.nextLine();

                System.out.printf("Masukan Email\t: ");
                email = input.nextLine();

                System.out.printf("Masukan No.Telp : ");
                telp = input.nextLine();

                System.out.println("\nNama\t: " + pengecekan.cek3(name));
                System.out.println("NIM\t: " + pengecekan.cek(NIM));
                System.out.println("Email\t: " + pengecekan.cek2(email));
                System.out.println("No.Telp\t: " + pengecekan.cek4(telp));
                
                correct = true;

                input.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }
}