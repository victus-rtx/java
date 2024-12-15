package pertemuan3;
import java.util.Scanner;
import java.io.*;

public class studykasus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bil1, bil2, pilihan, hasil;
        
        
        try{
        System.out.print("masukan nilai bilangan 1 : ");
        bil1 = input.nextInt();
        
        System.out.print("masukan nilai bilangan 2 : ");
        bil2 = input.nextInt();
        
        System.out.println("");
        
        System.out.println("1. penjumlahan\n2. pengurangan\n3. perkalian\n4. pembagian");
       
        System.out.print("masukan pilihan : ");
        pilihan = input.nextInt();
        
        System.out.println(" ");
        
        if(pilihan == 1){
            hasil = bil1 + bil2;
            System.out.println("hasilnya adalah : " + hasil);
        } else if(pilihan == 2){
            hasil = bil1 - bil2;
            System.out.println("hasilnya adalah : " + hasil);
        } else if(pilihan == 3){
            hasil = bil1 * bil2;
            System.out.println("hasilnya adalah : " + hasil);
        } else if (pilihan == 4){
            double bagi1 = (double) bil1;
            double bagi2 = (double) bil2;
            double bagi = bagi1 / bagi2;
            System.out.println("hasilnya adalah : " + bagi);
         } else{
            System.out.println("hasil tidak sesuai");
            }
        }
        catch(Exception e){
            System.out.println("nilai tidak sesuai");
        }
        
    }
    
}
