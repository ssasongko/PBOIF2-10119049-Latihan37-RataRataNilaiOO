package Mahasiswa;
import java.util.Scanner;
/**
 *
 * @author Nur Sasongko
 */
public class Mahasiswa {
    Scanner scan = new Scanner(System.in);
    
    public double[] nilaiMahasiswa = new double[255];
    public int banyakMahasiswa;
    
    public void setNilaiMahasiswa(){
        System.out.printf("Masukkan Banyaknya Mahasiswa : ");
        banyakMahasiswa = scan.nextInt();
        
        for(int i = 0; i < banyakMahasiswa; i++){
            System.out.printf("Nilai Mahasiswa ke-%d : ",i+1);
            nilaiMahasiswa[i] = scan.nextDouble();
        }        
    }
    
    public double getNilaiRataRataMHS(){
        double total = 0;
                
        // Get Nilai Total
        for(int i = 0; i < banyakMahasiswa;i++){
            total = total + nilaiMahasiswa[i];
        }
        
        return total / banyakMahasiswa ;
    }
}
