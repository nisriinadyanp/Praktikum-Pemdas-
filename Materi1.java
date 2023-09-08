package Pert1;

import java.util.Scanner; 

public class Materi1 {
    public static void main(String[] args) {
        //Output, Input, Operasi Aritmatika (+-/*, %, ++, +-dst.), Math.sqrt, printf

        // Output
        // System.out.println("Halo! Nama saya Adi");
        // System.out.println(16.7);

        // String nama1 = "Liya";
        // int angka1 = 2;
        // int angka2 = 3;
        // double angka3 = 3.5;

        // System.out.println("Hai! namaku " + nama1 + " umurku " + (angka1+angka2) + " tahun");

        //Input
        //Jangan lupa nulis import java.util.Scanner; 
        
        Scanner input = new Scanner (System.in);

        //Buat input string, ada 2 jenis, yaitu next dan nextLine
        // String nama2 = input.nextLine(); //Bisa lebih dari 1 kata, 1 kalimat
        // String nama3 = input.next(); //hanya bisa 1 kata

        // System.out.println(nama2);
        // System.out.println(nama3); //kalo tetep maksa input lebih dari 1 kata, ya yang kebaca tetep 1

        //Input Lain
        // int angka4 = input.nextInt();
        // float angka5 = input.nextFloat();
        // double angka6 = input.nextDouble();
        // boolean kebenaran1 = input.nextBoolean();
        // System.out.println(angka4);
        // System.out.println(angka5);
        // System.out.println(angka6);
        // System.out.println(kebenaran1);
        // Referensi bacaan : https://www.geeksforgeeks.org/scanner-class-in-java/

        // //input.nextLine();
        // String nnn = input.next();
        // //System.out.println(nnn);
        // int bbb = input.nextInt();
        // //System.out.println(bbb);
        // input.nextLine();
        // String ccc = input.nextLine();
        // //System.out.println(ccc);
        // int eee = input.nextInt();
        // //System.out.println(eee);
        // System.out.println(nnn + bbb + ccc + eee);
        // //System.out.println(ccc);

        //Operasi Aritmatika

        // + Untuk pertambahan
        // - Untuk pengurangan
        // / Untuk pembagian
        // * Untuk perkaliann
        // % modulus

        // int a = 5;
        // double b = 4.5;
        // int c = 24;
        // double z = a+b;
        // double y = c/ (double) a;
        // double x = c/5.0;
        // System.out.println(x);

        // int aa = 3;
        // int bb = 6;
        // double cc = 4;
        // double dd = 7;
        // double ee = 5 * 2 + bb / 4 - dd; 
        // System.out.println(ee);
        // double ff = bb + dd / 2 ;
        // System.out.println(ff);

        // % modulo = sisa pembagian 
        // int aaa = 9 % 5;
        // System.out.println(aaa);
        // int ccc = 5 * 9 % 7;
        // System.out.println(ccc); 

        //Perpangkatan
        double desimal1 = Math.pow(2, 3); //a pangkat b
        //System.out.println(desimal1);

        // //Akar 2
        // double desimal2 = Math.sqrt(16);
        // System.out.println(desimal2);
        // //Akar 3
        // double desimal3 = Math.cbrt(27);
        // System.out.println(desimal3);

        //Referensi bacaan : https://www.javatpoint.com/java-math

        //printf
        //bisa batesin angka di belakang koma buat desimal
        String nama = "Nisriina";
        int nilai = 90;
        float rataRata = 98.7825f;
        System.out.printf("Nama saya adalah %s\n", nama);
        System.out.printf("Nilai saya adalah %d\n", nilai);
        System.out.printf("Rata-rata saya adalaah %.2f\n", rataRata);
        System.out.printf("Nama saya adalah %s, nilai saya %d, dan rata rata saya %.2f\n", nama, 90, rataRata);

        




        


    }
}
