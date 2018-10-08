/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan39.oobesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini tentang nilai dari yang besar kecil dengan
 * OO.
 */
public class PBO210117048Latihan39OObesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nmPetugas;
        int jmlSiswa;

        Nilai value = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        nmPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jmlSiswa = scn.nextInt();
        System.out.println();

        value.masukNilaiMahasiswa(jmlSiswa);
        System.out.println();
        value.tampilNilaiTerbesarTerkecil(jmlSiswa);
        
        System.out.println("Nilai Terbesar : " + value.max);
        System.out.println("Nilai Terkecil : " + value.min);
        System.out.println();
        System.out.println("Nama Petugas : " + nmPetugas);
    
    }
    
}
