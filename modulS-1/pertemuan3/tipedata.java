package pertemuan3;

public class tipedata {
    public static void main(String[] args) {
        String nilai1 = "9";
        String nilai2 = "5";
        
        
        int bulat = Integer.parseInt(nilai1);
        double pecahan = Double.parseDouble(nilai2);
        
        System.out.println("hasil dari nilai 1 : " + nilai1);
        System.out.println("hasil dari nilai 2 : " + nilai2);
        
//        System.out.println( "hasil dari perkalian nilai 1 dengan nilai 2 adalah " + nilai1*pecahan );  
        System.out.println("hasil dari penjumlahan nilai1 dengan nilai 2 adalah : " + (nilai1 + nilai2));
        System.out.println("hasil dari perkalian antara bulat dan pecahan adalah : " + (bulat * pecahan));
    }
}
