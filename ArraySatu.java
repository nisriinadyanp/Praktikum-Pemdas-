package PertArray;
import java.util.*;

public class ArraySatu {
    public static void main(String[] args) {
        System.out.println("tes");

        Scanner input = new Scanner (System.in);
        
        // ARRAY
        // dapat menyimpan beberapa nilai dengan tipe data yang sama
        
        // 1D
        // deklarasi : (tipedata)[] namaArray = new (tipedata) [jumlahElemen]

        int[] angka = new int[7];
        float[] nilai = new float[10];
        String[] nama = new String[45];

        //indeks dimulai dari 0
        angka[0] = 9;
        angka[1] = 7;
        angka[2] = 7;
        angka[3] = 100;
        angka[4] = 7; 
        angka[5] = 8;

        int[] number = new int [] {1, 2, 3, 4, 5, 6};
        String[] name = new String [] {"Alek", "Budi", "Cita", "Dudu"};

        // for (int i = 0; i<nilai.length; i++) {
        //     System.out.println("Masukkan nilai array untuk indeks ke-" + i);
        //     nilai[i] = input.nextFloat();
        // }

        // Cara ngeprint
        // System.out.println(angka[3]);
        // System.out.println(nama[0]);

        // For loop
        // for (int j = 0; j<angka.length; j++) {
        //     System.out.println("Ini adalah array angka indeks ke-" + j + ": " + angka[j]);
        // }

        // .toString
        // System.out.println("Array angka: " + Arrays.toString(angka));

        // for each
        // for (int k : angka){
        //     System.out.println(k);
        // }

        // for (int k = 0; k<angka.length; k++) {
        //     System.out.println(angka[k]);
        // }

        // for (String namaa : name) {
        //     System.out.println(namaa);
        // }

        // for (int l = 0; l<name.length; l++) {
        //      System.out.println(name[l]);
        // }

        // // contoh penggunaan 
        // int bestscr = 0;
        // System.out.println("masukkan jumlah anak");
        // int jmlh = input.nextInt();
        // int a[] = new int[jmlh];

        // System.out.println("Masukkan" + jmlh +  "nilai");
        // for (int m = 0; m < jmlh; m++){
        //     a[m] = input.nextInt();
        //     if ( bestscr < a[m]) {
        //         bestscr = a[m];
        //     }
        // }
        // System.out.println("Nilai tertinggi = " + bestscr);

        // for (int j = 0; j < jmlh; j++){
        //     System.out.println("Nilai anak ke-" + (j + 1));
        // }

        // // Reference Array
        // int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println(Arrays.toString(arrayA));
        // int[] arrayB = {10, 20, 30, 40, 50, 60, 70};
        // System.out.println(Arrays.toString(arrayB));

        // arrayB = arrayA;
        // System.out.println(Arrays.toString(arrayB));

        // arrayB[3] = 85;
        // arrayA[0] = 95;
        // System.out.println("arrayA: " + Arrays.toString(arrayA));
        // System.out.println("arrayB: " + Arrays.toString(arrayB));
    }
}
