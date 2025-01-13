package pertemuan4;
import java.util.*;

 public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamMinggu, totalGaji;
        
        System.out.print("masukan jam minggu : ");
        jamMinggu = input.nextInt();
        
        if(jamMinggu < 50){
        totalGaji = jamMinggu * 2500;
        } else if(jamMinggu <= 60){
        totalGaji = jamMinggu * 5000;
        }else{
        totalGaji = ((jamMinggu - 60) * 7500) + (60 * 5000);
        }
        
        System.out.println("total gaji : " + totalGaji);
    }
}
