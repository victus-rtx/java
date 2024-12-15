package Pertemuan2;

import java.io.*;

public class bufferedraider {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String namaDepan, namaBelakang, alamat, tempatLahir, tanggalLahir;
        int usia;
        
       
        System.out.print("MASUKAN NAMA DEPAN ANDA : ");
        try {
            namaDepan = br.readLine();
            
            System.out.print("MASUKAN NAMA BELAKANG ANDA : ");
            namaBelakang = br.readLine();
            
            System.out.print("MASUKAN ALAMAT ANDA : ");
            alamat = br.readLine();
            
            System.out.print("MASUKAN TEMPAT LAHIR ANDA : ");
            tempatLahir = br.readLine();
            
            System.out.print("MASUKAN TANGGAL LAHIR ANDA : ");
            tanggalLahir = br.readLine();
            
            // output
            
            System.out.println("\n\t===== DATA DIRI ANDA =====");
            
            System.out.println("nama depan anda adalah \t\t: " + namaDepan);
            System.out.println("nama belakang anda adalah \t: " + namaBelakang);
            System.out.println("alamat anda adalah \t\t: " + alamat);
            System.out.println("tempat lahir anda adalah \t: " + tempatLahir);
            System.out.println("tanggal lahir anda adalah \t: " + tanggalLahir);
            
        } catch (IOException e) {
           
        }
        
    }
}
