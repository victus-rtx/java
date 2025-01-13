package UJIAN;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahunLahir, umur;
        
        System.out.print("Masukan tahun lahir : ");
        tahunLahir = input.nextInt();
        umur = 2025 - tahunLahir;
       
        if(umur <= 5){
            System.out.println("Usia : " + umur + " tahun merupakan kategori Balita");
        } else if(umur >=6 && umur <=9){
            System.out.println("Usia : " + umur + " tahun merupakan kategori anak - anak");
        } else if(umur >= 10 && umur <= 18){
            System.out.println("Usia : " + umur + " tahun merupakan kategori Remaja");
        } else if(umur >= 19 && umur < 59){
            System.out.println("Usia : " +umur + " tahun merupakan kategori Dewasa");
        }else{
            System.out.println("Usia : " + umur + " tahun merupakan kategori Lansia");
        }
        
    }
}