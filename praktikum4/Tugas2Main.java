package praktikum4;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2[][] mhs = new Tugas2[10][10];
        mhs[0][0] = new Tugas2("kelompok 1", "Alfi", 1);
        mhs[0][1] = new Tugas2("kelompok 1", "Safira", 2);
        mhs[0][2] = new Tugas2("kelompok 1", "Tiara", 3);
        mhs[0][3] = new Tugas2("kelompok 1", "Arif", 4);
        mhs[0][4] = new Tugas2("kelompok 1", "Erdi", 5);

        mhs[1][0] = new Tugas2("kelompok 2", "Yuda", 1);
        mhs[1][1] = new Tugas2("kelompok 2", "Nisa", 2);
        mhs[1][2] = new Tugas2("kelompok 2", "Yulia", 3);
        mhs[1][3] = new Tugas2("kelompok 2", "Fauzan", 4);
        mhs[1][4] = new Tugas2("kelompok 2", "Dwi", 5);

        mhs[2][0] = new Tugas2("kelompok 3", "Dewa", 1);
        mhs[2][1] = new Tugas2("kelompok 3", "Ana", 2);
        mhs[2][2] = new Tugas2("kelompok 3", "Abdul", 3);
        mhs[2][3] = new Tugas2("kelompok 3", "Dani", 4);
        mhs[2][4] = new Tugas2("kelompok 3", "Ammar", 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < mhs.length; i++) {
            for (int j = 0; j < mhs[i].length; j++) {
                if (mhs[i][j] != null && cari.equalsIgnoreCase(mhs[i][j].namaMahasiswa)) {
                    System.out.println("Nama Mahasiswa: " + mhs[i][j].namaMahasiswa);
                    System.out.println(mhs[i][j].kelompok);
                    System.out.println("Urutan pada nomor ke - " + mhs[i][j].urutan);
                    found = true;
                    break; 
                }
            }
            if (found) {
                break; 
            }
        }

        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
