package pertemuan4;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak, harga, subTotal, potongan,total, urutan;
        
        System.out.print("masukan nomor urut : ");
        urutan = input.nextInt();
        
        System.out.print("masukan banyak barang yang dibeli : ");
        banyak = input.nextInt();
        
        System.out.print("masukan harga yang di beli");
        harga = input.nextInt();
        
        subTotal = banyak * harga;
        
        if(urutan < 50){
            if(subTotal < 50000){
            potongan = (5 * subTotal) / 100;
            }else{
            potongan = (15 * subTotal) / 100;
            }
        }else{
         if (subTotal < 50000){
         potongan = 0;
         }else{
         potongan = (10 * subTotal) / 100;
         }
        }
        total = subTotal - potongan;
        System.out.println("total potongan : " + potongan);
        System.out.println("total yang di bayar " + total);
    }
}
