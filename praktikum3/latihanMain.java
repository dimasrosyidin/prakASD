package praktikum3;
import java.util.Scanner;
public class latihanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("PEMILIHAN SUARA KETUA BEM");
        latihan bem = new latihan();
        latihan[] hsl = new latihan[bem.Jmlkandidat];
        for (int i = 0; i < bem.Jmlkandidat ; i++) {
            hsl[i] = new latihan();
            System.out.print("Nama Kandidat ke- " + (i + 1) + " : ");
            hsl[i].namaKandidat = sc.nextLine();
        }
        for (int i = 0; i < bem.Jmlkandidat; i++) {
            System.out.print(" Masukkan Jumlah Suara Kandidat ke " + (i + 1) + " : ");
            hsl[i].suara = sc.nextInt();
            bem.jmlSuara += hsl[i].suara;
        }
        System.out.println("-------------------------------------");
        int hasil = bem.hasilPemilihan(bem.jmlSuara,hsl[0].suara, hsl[1].suara, hsl[2].suara, hsl[3].suara);
            System.out.println("Ketua BEM tahun 2022 adalah : " + hsl[hasil - 1].namaKandidat);
        }
}
