package praktikum3;
import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pangkat[]png = new pangkat[5];
            png[0] = new pangkat(7, 2);
            png[1] = new pangkat(20, 2);
            png[2] = new pangkat(25, 3);
            png[3] = new pangkat(30, 2);
            png[4] = new pangkat(35, 3);
            
        int pilihan;
        do{  
            System.out.println("============================");
            System.out.println("Penghitung Hasil Pangkat : ");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            System.out.println("============================");
    

            switch (pilihan) {
                
                case 1:
                System.out.println("============================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i< png.length; i++){
                    System.out.println("Nilai "+ png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBf(png[i].nilai,png[i].pangkat) );
                }
                break;

                case 2:
                System.out.println("============================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i<png.length; i++){
                System.out.println("Nilai "+ png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai,png[i].pangkat) );
                }
                break;

                case 0:
                System.out.println("============================");
                System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("============================");
                    System.out.println("Pilihan tidak valid.");
                    break;
                    
            }
        } while (pilihan != 0);
    }
}
    
