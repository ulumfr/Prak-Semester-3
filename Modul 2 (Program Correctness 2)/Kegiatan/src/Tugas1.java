import java.util.*;

public class Tugas1 {
    static final String code = "10370311", domain = "@webmail.umm.ac.id";

    String cek(String nim) {
        if (nim.length() != 15) {
            return "The number needs to be 15 digits!";
        } else if (!nim.contains(code)) {
            return "The number needs to contains 10370311";
        }
        return nim;
    }

    String cek2(String email) {
        if(!email.contains(domain)){
            return "The email needs to contains domain @webmail.umm.ac.id";
        }
        return email;
    }

    String cek3(String name){
        name = name.replaceAll("\\d","");
        return name;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tugas1 pengecekan = new Tugas1();
        boolean correct = false;
        String name, email, NIM, temptelp;
        Long Telp;

        // 202110370311462
        // bahrululumfr@webmail.umm.ac.id
        // 85731513332
        // Bahrul Ulum
        
        
        while(!correct){
            try{
                System.out.printf("Masukan Nama\t: ");
                name = input.nextLine();

                System.out.printf("Masukan NIM\t: ");
                NIM = input.nextLine();

                System.out.printf("Masukan Email\t: ");
                email = input.nextLine();

                System.out.printf("Masukan No.Telp : ");
                temptelp = input.nextLine();
                Telp = Long.parseLong(temptelp);

                System.out.println("\nNama\t: " + pengecekan.cek3(name));
                System.out.println("NIM\t: " + pengecekan.cek(NIM));
                System.out.println("Email\t: " + pengecekan.cek2(email));
                System.out.println("No.Telp\t: 0" + Telp);
                
                correct = true;

                input.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}