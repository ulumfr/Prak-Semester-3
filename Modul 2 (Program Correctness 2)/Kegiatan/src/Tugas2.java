import java.util.*;

interface library {

    boolean cekName(String function, String name);
    boolean cekFrom(String funcion, String from);
    void cekDate(int date);
    void list();

}

public class Tugas2 implements library {
    Scanner input = new Scanner(System.in);
    String inName, inFrom;
    int inDate, inIndex = 1;

    public String[] book = new String[1];

    public String[] place = { "Malang", "Bandung", "Surabaya" };

    public void cekDate(int date) {
        for (int i = 0; i < book.length; i++) {
            int parsedYear = Integer.parseInt(parseBook(book[i], "date"));
            if (parsedYear < 2018 && date < 2018) {
                System.out.printf("%s, %s. %s\n", parseBook(book[i], "name"), parseBook(book[i], "from"), parseBook(book[i], "date"));
            } else {
                System.out.printf("%s, %s. %s\n", parseBook(book[i], "name"), parseBook(book[i], "from"), parseBook(book[i], "date"));
            }
        }
    }

    public boolean cekFrom(String function, String from) {
        if (function.equals("region")) {
            for (String p : place) {
                if (p.equals(from)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cekName(String function, String name) {
        if (function.equals("add")) {
            for (String b : book) {
                if (name.compareTo(parseBook(b, "name")) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void list() {
        System.out.printf("\n%-15s | %-15s | %-15s", "Name", "From", "Year"); // category table
        for (String b : book) {
            System.out.printf("\n%-15s , %-15s . %-15s", parseBook(b, "name"), parseBook(b, "from"),
                    parseBook(b, "date"));
        }
        menu();
    }

    private String parseBook(String book, String category) {
        String[] parsedBook = book.split("[,.]"); // memanipulasi string
        String parsedName = parsedBook[0];
        String parsedFrom = parsedBook[1];
        String parsedDate = parsedBook[2];
        if (category.equals("name")) {
            return parsedName;
        } else if (category.equals("from")) {
            return parsedFrom;
        } else if (category.equals("date")) {
            return parsedDate;
        } else {
            return "KOSONG!!!";
        }
    }

    public void register() {
        System.out.println("\n## Register ##");
        input.nextLine();
        inputName();
        inputFrom();
        inputDate();

        String bookName = (inName + "," + inFrom + "." + inDate);
        book = Arrays.copyOf(book, inIndex + 1);
        book[inIndex] = bookName;
        inIndex++;

        System.out.println("Buku berhasil ditambahkan!");
        menu();
    }

    public void inputName() {
        System.out.print("Nama : ");
        inName = input.nextLine();
        try {
            if (cekName("add", inName)) {
                throw new Exception("Nama Buku sudah terinput di sistem");
            }
        } catch (Exception e) {
            System.out.println(e);
            inputName();
        }
    }

    public void inputFrom() {
        System.out.print("From : ");
        inFrom = input.nextLine();
        try {
            if (!cekFrom("region", inFrom)) {
                throw new Exception("Wilayah Kota tidak terdaftar di sistem");
            }
        } catch (Exception e) {
            System.out.println(e);
            inputFrom();
        }
    }

    public void inputDate() {
        System.out.print("Date : ");
        inDate = input.nextInt();
    }

    private void menu() {
        System.out.print("\n======================================");
        System.out.println("\n\tWelcome to UMM Library");
        System.out.print("======================================\n");
        System.out.println("1. Book Register\n2. List Book\n3. Exit");
        System.out.print("Pilih menu : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                register();
                break;
            case 2:
                list();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("\nWRONG!!");
        }
    }

    public static void main(String[] args) {
        Tugas2 main = new Tugas2();
        main.book[0] = "This is Book,Malang.2022";
        main.menu();
    }
}
