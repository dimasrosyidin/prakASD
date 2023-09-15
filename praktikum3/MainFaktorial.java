package praktikum3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        faktorial[] fk = new faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " :");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("===================================");
        long awal = System.currentTimeMillis();
        System.out.println("waktu awal : " + String.valueOf(awal)+ " milidetik");
        System.out.println("===================================");
        System.out.println("Hasil faktorial dengan Brute Force");

        for (int i = 0; i < elemen; i++) {

            int hasilBF = fk[i].FaktorialBF(fk[i].nilai);

            System.out.println("Faktorial dari nilai  " + fk[i].nilai + " adalah :" + hasilBF);
           
        }

        System.out.println("===================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");

        for (int i = 0; i < elemen; i++) {

            int hasilDC = fk[i].FaktorialBF(fk[i].nilai);


            System.out.println("Faktorial dari nilai  " + fk[i].nilai + " adalah :" + hasilDC);
            
        }
       
        System.out.println("===================================");
        long akhir = System.currentTimeMillis();
        System.out.println("waktu akhir : " + String.valueOf(akhir)+ " milidetik");
        System.out.println("===================================");
        long interval = akhir - awal;
        System.out.println("interval waktu : " + String.valueOf(interval)+ " milidetik");
        System.out.println("===================================");
    }
}

