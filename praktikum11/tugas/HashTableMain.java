package tugas;
import java.util.ArrayList;
import java.util.Scanner;;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable mhsTable = new HashTable();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Tampilkan Semua NIM Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-4): ");
            int pilih = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String NIM = scanner.nextLine();
                    System.out.print("Masukkan Nama Lengkap: ");
                    String namaLengkap = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();
                    System.out.print("Masukkan Program Studi: ");
                    String programStudi = scanner.nextLine();

                    Mahasiswa newMahasiswa = new Mahasiswa(NIM, namaLengkap, jurusan, programStudi);
                    mhsTable.set(newMahasiswa);
                    System.out.println("Mahasiswa ditambahkan");
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cariNim = scanner.nextLine();

                    Mahasiswa foundMahasiswa = mhsTable.get(cariNim);
                    if (foundMahasiswa != null) {
                        System.out.println("Data Mahasiswa yang dicari:");
                        System.out.println("NIM: " + foundMahasiswa.getNIM());
                        System.out.println("Nama Lengkap: " + foundMahasiswa.getNamaLengkap());
                        System.out.println("Jurusan: " + foundMahasiswa.getJurusan());
                        System.out.println("Program Studi: " + foundMahasiswa.getProgramStudi());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ada");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String hps = scanner.nextLine();
                
                    mhsTable.remove(hps);
                    break;
                
                case 4:
                    System.out.println("\nData Mahasiswa yang Tersimpan  ");
                    mhsTable.printTable();
                break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
