package praktikum5;
import java.util.Scanner;
public class MainPaskib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarAnggotaPaskibraka data = new DaftarAnggotaPaskibraka();
        int jumMhs= 10;
        for (int i =0; i<jumMhs;i++){
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Kelas = ");
            String kelas = s1.nextLine();
            System.out.print("Tinggi = ");
            int tinggi = s.nextInt();
            s.nextLine();
            System.out.println();

            Paskibraka p = new Paskibraka(nama, kelas, tinggi);
            data.tambah(p);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data paskibraka sebelum sorting = ");
        data.tampil();

        System.out.println("Data paskibraka setelah sorting desc berdasarkan Tinggi ");
        data.Sorting();
        data.tampil();
    }
    
}
