package PertArray;

import java.util.*;

public class ArrayDua {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // review 
        // Array 1D
        // Deklarasi 
        int[] angka = new int[7];
        //String[] nama = new String[] {"Andi", "Budi", "Caca", "Didi"};

        String nama = "Nisriina Dyan";
        // String[] namaPotong = nama.split(" ");
        // namaPotong[1];
        

        // Array 2 Dimensi 
        // [Baris][Kolom] 

        // Deklarasi Array 2 Dimensi
        // (tipedata)[] namaArray = new (tipedata) [jumlahBaris][jumlahKolom]
        int[][] array2dSatu = new int [2][4];
        // [baris][kolom]
        // [2][4]
        int[][] array2dDua = new int[][] {{1, 4, 3, 5}, {7, 2, 4, 1}};

        // tebak 
        int[][] array2dTiga = new int[][] {{6, 7, 8}, {8, 5, 8, 9, 5}, {1, 2}, {2, 7, 7}};
        //[baris?][kolom?]
        //[4][5]

        // Memasukkan nilai
        // (namaArray)[indeksBaris][indeksKolom]
        array2dSatu[2][1] = 9;
        array2dSatu[2][1] = 10;
        
        for (int i = 0; i < array2dSatu.length; i++) {
            for (int j = 0; j < array2dSatu[i].length; j++) {
                System.out.printf("Masukkan nilai untuk array di index [%d][%d]", i, j);
                array2dSatu[i][j] = input.nextInt(); 
            }
            System.out.print("\n");
        }

        // Tampilkan 
        
        // For loop 
        System.out.println("Array2dSatu: ");
        for (int i = 0; i < array2dSatu.length; i++) {
            for (int j = 0; j < array2dSatu[i].length; j++) {
                System.out.print(array2dSatu[i][j] + " ");
            }
            System.out.print("\n");
        }

        for(int[] baris: array2dDua){
            for(int kolom : baris){
                System.out.print(kolom + " ");
            }
            System.out.println();
        }



        
    }
}
