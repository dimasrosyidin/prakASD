package praktikum4;
import java.util.Scanner;
public class Tugas4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = sc.nextInt();
        sc.nextLine();  

        
        Tugas4[] dataPenduduk = new Tugas4[jumlahPenduduk];

        // Input data penduduk
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.println("Masukkan data penduduk ke-" + (i + 1));
            System.out.print("NIK: ");
            String nik = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Alamat: ");
            String alamat = sc.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = sc.nextLine();

            dataPenduduk[i] = new Tugas4(nik, nama, alamat, jenisKelamin);
        }

        System.out.println("------DATA PENDUDUK-----");
        for (Tugas4 penduduk : dataPenduduk) {
            System.out.println("NIK: " + penduduk.cariNik());
            System.out.println("Nama: " + penduduk.cariNama());
            System.out.println("Alamat: " + penduduk.cariAlamat());
            System.out.println("Jenis Kelamin: " + penduduk.cariJenisKelamin());
            System.out.println();
        }
        System.out.println("-----CARI DATA PENDUDUK-----");
        System.out.print("Masukkan NIK yang akan dicari: ");
        String nikCari = sc.nextLine();

    
        boolean ditemukan = false;
        for (Tugas4 penduduk : dataPenduduk) {
            if (penduduk.cariNik().equals(nikCari)) {
                System.out.println("Data ditemukan:");
                System.out.println("NIK: " + penduduk.cariNik());
                System.out.println("Nama: " + penduduk.cariNama());
                System.out.println("Alamat: " + penduduk.cariAlamat());
                System.out.println("Jenis Kelamin: " + penduduk.cariJenisKelamin());
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }

    }
}
