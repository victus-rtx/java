package pertemuan5;
import java.util.Scanner;
//tugas modul semester 1, hal 27;
public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = -2, n;
        System.out.print("MASUKAN NILAI N : ");
        n = input.nextInt();
        
        for(int i = 1;i <= n; i++){
            if(i % 2 == 0){
                System.out.print(a + " ");
                a--;
                a-=1;
            } else{
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
