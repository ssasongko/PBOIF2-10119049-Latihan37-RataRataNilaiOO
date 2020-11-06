/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan37.rataratanilaioo;
import Mahasiswa.Mahasiswa;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program menampilkan rata-rata nilai
 */
public class PBOIF210119049Latihan37RataRataNilaiOO {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setNilaiMahasiswa();
        System.out.printf("\nMaka Rata-rata nilainya adalah %.1f",mahasiswa.getNilaiRataRataMHS());
        System.out.printf("\nDeveloped by Nur Sasongko\n");
    }
    
}
