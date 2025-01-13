package pertemuan4;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int akademik, keterampilan, psikologi;
        double rataRata;
        
        System.out.print("masukan nilai akademik : ");
        akademik = input.nextInt();
        
        System.out.print("masukan nilai keterampilan : ");
        keterampilan = input.nextInt();
        
        System.out.print("masukan nilai psikologi : ");
        psikologi = input.nextInt();
        
        rataRata = (akademik + keterampilan + psikologi) / 3;
        
        if(rataRata >= 75){
            if((akademik > keterampilan) || (akademik > psikologi)){
                System.out.println("anda di terima di bagian administrasi");
            }else if((keterampilan > akademik)&&(keterampilan > psikologi)){
                System.out.println("anda di terima di bagian produksi");
            } else{
                System.out.println("anda di terima di bagian pemasaran");
            }
        }else{
            System.out.println("anda tidak di terima");
        }
    }

}
