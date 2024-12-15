package Pertemuan1;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, nim;
        
        System.out.print(" masukan nama anda : ");
        name = input.nextLine();
        
        System.out.print(" masukan nim anda : ");
        nim = input.nextLine();
        
        System.out.println("\n\t===ID ANDA===\n");
        
        System.out.println("nama    : " + name);
        System.out.println("nim     : " + nim);
    }
}
