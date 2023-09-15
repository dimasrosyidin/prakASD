package praktikum3;
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("====================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int prs = sc.nextInt();
    
        sum prshn[]= new sum[prs];
        for(int i=0; i<prs; i++){
            prshn[i] = new sum();
            System.out.println("====================");
            System.out.println("Perusahaan ke -"+(i+1));
            System.out.print("Masukkan Jumlah Bulan : ");
            prshn[i].elemen = sc.nextInt();
        
            prshn[i].keuntungan = new double[prshn[i].elemen];
        
            System.out.println("====================");
            for(int j=0; j<prshn[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke -"+(j+1)+" = ");
                prshn[i].keuntungan[j] = sc.nextDouble();
            }
        }
        System.out.println("====================");
       
        for(int i=0; i<prshn.length; i++){
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.println("Jumlah Bulan : "+prshn[i].elemen);
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungam perusahaan selama "+prshn[i].elemen+" bulan adalah : %.2f ", prshn[i].totalBF(prshn[i].keuntungan));
            System.out.println();
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungam perusahaan selama "+prshn[i].elemen+" bulan adalah : %.2f ", prshn[i].totalDC(prshn[i].keuntungan, 0, prshn[i].elemen-1));
            System.out.println();
        }
    }
    
}
