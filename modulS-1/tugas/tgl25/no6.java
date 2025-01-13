package tugas.tgl25;

public class no6 {
    public static void main(String[] args) {
        int awal, n_2, n_1;
        awal = 1;
        n_2 = 0;
        n_1 = 1;

        for (int i = 1; i <= 9; i++) {
            System.out.print(awal + " ");
            awal = n_2 + n_1;
            n_2 = n_1;
            n_1 = awal;
        }

    }

}
