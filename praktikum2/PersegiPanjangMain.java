package praktikum2;
import java.util.Scanner;

public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Persegi Panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlahPersegiPanjang];

        for(int i = 0; i<jumlahPersegiPanjang ; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i<jumlahPersegiPanjang ; i++){
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }
    
}
