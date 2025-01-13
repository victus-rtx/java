package pertemuan5;


public class NewClass1 {
    public static void main(String[] args) {
        int awal = 4096;
        
        for(int i = 1; i < 7; i++){
            System.out.print(awal + " ");
            awal /= 2;
        }
        System.out.println("");
    }
}
