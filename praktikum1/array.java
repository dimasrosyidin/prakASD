import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]  stokroyalGarden = {
                                {10,5,15,7},
                                {6,11,9,12},
                                {2,10,10,5},
                                {5,7,12,9}
        };
        int [] harga = {75000,50000,60000,1000};
        int [] cabang = new int [4];
        for (int i = 0; i < stokroyalGarden.length; i++) {
            for (int j = 0; j < stokroyalGarden[i].length; j++) {
                cabang[j] += stokroyalGarden[i][j];
            }
        }

        System.out.println("Jumlah Stok Bunga di Seluruh Cabang");
        System.out.println("_________________________________");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println( "Nama Bunga  :  " + jenisBunga[i]);
            System.out.println( "Total Bunga :  " + cabang[i]);
            System.out.println("_________________________________");
        }

        int pendapatan = 0;
        for (int j = 0; j < stokroyalGarden[0].length; j++) {
            int penguranganStok = stokroyalGarden[0][j];
            if (j == 0) {
                penguranganStok -= 1;
            } else if (j == 1) {
                penguranganStok -= 2;
            } else if (j == 3) {
                penguranganStok -= 5;
            }
            pendapatan += harga[j] * penguranganStok;
        }

        System.out.println("Total Pendapatan dari RoyalGarden 1 jika Semua Bunga Terjual Habis : " + pendapatan);

    }
}
