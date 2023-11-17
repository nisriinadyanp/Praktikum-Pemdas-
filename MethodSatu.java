package PertMethod;

import java.util.*;

public class MethodSatu {
    public static void main(String[] args) {
    //    tampilkanNama();
    //    tampilkanNama("Nisriina");
    //    tampikanNama("Ciello", "SI C");
    //    //tampilkanNama("Fayza", "TIF A", "17");
    //    tampilkanUmur("Hanifa", 15);

    getAngka7(); // 7
    //System.out.println(getAngka7());
    int angka7 = getAngka7();
    //System.out.println(angka7);

    tambahDuaAngka(5, angka7);
    //System.out.println(tambahDuaAngka(5, angka7));
    int a = tambahDuaAngka(getAngka7(), 4);
    //System.out.println(a);

    //System.out.println(isGanjil(10));

    int[] array1 = new int [] {1,2,3,4,5};
    int[] array2 = new int [] {7,8,9,5};
    int[] array3 = new int [] {7,11,5};

    // System.out.println(hitungJumlah(array1));
    // System.out.println(hitungJumlah(array2));
    // System.out.println(hitungJumlah(array3));

    //hitung array1
    int hasil1 = 0;
        for(int i =0; i<array1.length; i++){
            hasil1 = hasil1 + array1[i];
        }
    System.out.println(hasil1);
    
     
    int hasil2 = 0;
        for(int i =0; i<array2.length; i++){
            hasil2 = hasil2 + array2[i];
        }
    
    int hasil3 = 0;
    for(int i =0; i<array3.length; i++){
        hasil3 = hasil3 + array3[i];
    }

}


    // Method Void
    static void tampilkanNama() {
        System.out.println("Nama saya Rafie dari kelas TI C");
    }

    static void tampilkanNama(String nama){
        System.out.println("Nama saya " + nama + " dari kelas TI C");
    }

    static void tampikanNama(String nama, String kelas) {
        System.out.println("Nama saya " + nama + " dari kelas " + kelas);
    }

    static void tampilkanUmur(String nama, int umur) {
        System.out.println("Nama saya " + nama + " umur " + umur);
    }

    static void totalUmur (int umurSatu, int umurDua) {
        int totalUmur = umurSatu + umurDua;
        System.out.println("Umur satu = " + umurSatu);
        System.out.println("Umur Dua = " +  umurDua);
        System.out.println("Total umurnya adalah " + totalUmur);
    }
    //Method Return Value
    static int getAngka7() {
        return 7;
    }

    static int tambahDuaAngka (int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    static boolean isGanjil(int a) {
        if (a%2 == 0) {
            //2System.out.println("Ini adalah genap!");
            return false;
        }else{
            return true;
        }
    }

    static int hitungJumlah (int[] array) {
        int hasil = 0;
        for(int i =0; i<array.length; i++){
            hasil = hasil + array[i];
        }
        return hasil;
    }
}
