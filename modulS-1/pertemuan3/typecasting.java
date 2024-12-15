package pertemuan3;
import java.util.Scanner;
import java.io.*;


public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        
        try{
        System.out.print("masukan angka a : ");
        a = input.nextInt();
        
        System.out.print("masukan angka b : ");
        b = input.nextInt();
        
        int penjumlahan = a + b;
        int pengurangan = a - b;
        int perkalian = a * b;
        double pembagian = (double) a / b;
        
        System.out.println(" ");
        System.out.println("\t=== HASIL ===");
        System.out.println(" ");
        
        System.out.println("penjumlahan : " + penjumlahan);
        System.out.println("pengurangan : " + pengurangan);
        System.out.println("perkalian : " + perkalian);
        System.out.println("pembagian : " + pembagian);
        }
        catch(Exception e){
            System.out.println("nilai tidak sesuai");
        }
    }
}
