package tugas.tgl25;

import java.util.*;

public class segitiga1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j, k, n;
        System.out.print("masukan jumlah baris : ");
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= 1; k++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}
