package romi;
import java.util.ArrayList;
import java.util.Scanner;

import Method;

import romi.Method;

public class Tugas2 implements Method{
    ArrayList<String>book = new ArrayList<>(10);
    ArrayList<String>place = new ArrayList<>(10);
    ArrayList<Integer>date = new ArrayList<>(10);

//    String[][] book = new String[10][10];
//    String[][] place = new String[10][10];
//    String[][] date = new String[10][10];


    @Override
    public boolean cekName(String name) {
        if(book.isEmpty()){
            return true;
        }else{
            for(String ignored : book){
                if(book.contains(name)){
                    throw new IllegalArgumentException("Sudah Terdaftar");
                }else{
                    return true;
                }
            }
        }
        return cekName(name);

//        for(int i = 0;i < book.length;i++) {
//            for(int j = 0;j < i;j++) {
//                if(book != null){
//                    if(book[i][j].equals(name)){
//                        System.out.println("Sudah terdaftar");
//                    }
//                }else{
//                    book[0][0] = name;
//                }
//            }
//        }

    }

    @Override
    public boolean cekFrom(String from) {
        if(place.isEmpty()){
            return true;
        }else{
            for(String ignored : place){
                if(place.contains(from)){
                    throw new IllegalArgumentException("Sudah Terdaftar");
                }else{
                    return true;
                }
            }
        }
        return cekFrom(from);

    }

    @Override
    public boolean cekDate(int indate) {
        if(indate>2018 && indate < 2022){
            if(date.isEmpty()){
                return true;
            }else{
                for(int ignored : date){
                    if(date.contains(indate)){
                        throw new IllegalArgumentException("Sudah Terdaftar");
                    }else {
                        return true;
                    }
                }
            }
        }else{
            throw new IllegalArgumentException("harus tahun 2019-2021");
        }
        return cekDate(indate);

    }

    @Override
    public void list() {
        int i =0;
        for(String row : book) {
            System.out.println("nama   : "+row);
            System.out.println("Tempat : "+place.get(i));
            System.out.println("Tahun  : "+date.get(i)+"\n\n");
            i++;
        }
    }

    public static void main(String[] args) {
        Tugas2 tug = new Tugas2();
        String inName,inFrom;
        int inDate;
        String yesnt;
        boolean aman = false;
        do {
            Scanner input = new Scanner(System.in);
            try{
                System.out.println("Welcome to Libary");
                System.out.print("Nama\t : ");
                inName = input.nextLine();
                tug.cekName(inName);
                System.out.print("From\t : ");
                inFrom = input.nextLine();
                tug.cekFrom(inFrom);
                System.out.print("Date\t : ");
                inDate = input.nextInt();
                tug.cekDate(inDate);
                input.reset();
                if(tug.cekName(inName)&&tug.cekFrom(inFrom)&&tug.cekDate(inDate)){
                    tug.book.add(inName);
                    tug.place.add(inFrom);
                    tug.date.add(inDate);
                }
                System.out.println("out? y/n");
                yesnt = input.next();
                switch (yesnt){
                    case "y":
                        aman = true;
                        break;
                    case "n":
                        break;
                }
            }catch (Exception e){
//                input.close();
                System.out.println(e);
            }
        }while(!aman);
//        int i = 0;
//        while(i<tug.book.length){
//            System.out.println("Welcome to Libary");
//            System.out.print("Nama\t : ");
//            inName = input.nextLine();
//            tug.cekName(inName);
//            System.out.print("From\t : ");
//            inFrom = input.nextLine();
//            tug.cekFrom(inFrom);
//            System.out.print("Date\t : ");
//            inDate = input.nextInt();
//            tug.cekDate(inDate);
//            i++;
//        }
        tug.list();



//        System.out.println(inName+" "+inFrom+" "+inDate);
//        System.out.println("Buku berhasil ditambahkan");

    }
}
