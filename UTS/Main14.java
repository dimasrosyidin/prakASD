
import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        System.out.println("UTS PRAKTIKUM ASD SIB 2B");
        System.out.println("-------------------------------------------");
        System.out.println("Dibuat oleh: Dimas Rosyidin");
        System.out.println("NIM: 2241760054");
        System.out.println("Nomor Absen: 14 ");
        System.out.println("===========================================");
        Pesanan14[] antrian = new Pesanan14[100];
        Pembeli14[] daftarPembeli = new Pembeli14[100];
        int nomorAntrian = 1;
        int totalAntrian = 0;

        Scanner dimas = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian"); 
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1-5) : ");
            int menu = dimas.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan kode pesanan: ");
                    String kodePesanan = dimas.next();
                    System.out.print("Masukkan nama customer: ");
                    String namaPembeli = dimas.next();
                    System.out.print("Masukkan nomor HP customer: ");
                    String nomorHp = dimas.next();

                    Pesanan14 pesanan = new Pesanan14(kodePesanan, "", 0); 
                    Pembeli14 pembeli = new Pembeli14(namaPembeli, nomorHp);

                    if (totalAntrian < antrian.length) {
                        antrian[totalAntrian] = pesanan;
                        daftarPembeli[totalAntrian] = pembeli;
                        System.out.println("Nomor Antrian: " + nomorAntrian);
                        nomorAntrian++;
                        totalAntrian++;
                    } else {
                        System.out.println("Antrian penuh.");
                    }
                    break;

                case 2:
                    if (totalAntrian == 0) {
                        System.out.println("Antrian masih kosong.");
                    } else {
                        System.out.println("-------------------------------------------");
                        System.out.println("Daftar Antrian Resto Royal Delish");
                        System.out.println("-------------------------------------------");
                        System.out.println("|No   |\tNama Customer");
                        for (int i = 0; i < totalAntrian; i++) {
                            System.out.println("|"+ (i + 1) + "   \t|\t" + daftarPembeli[i].getNama());
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("Total Antrian: " + totalAntrian);
                    }
                    break;

                case 3:
                System.out.print("Masukkan nomor antrian : ");
                int nomorUpdate = dimas.nextInt();
                
                if (nomorUpdate > 0 && nomorUpdate <= totalAntrian) {
                    Pesanan14 pesananUpdate = antrian[nomorUpdate - 1];
                    System.out.println("-------------------------------------------");
                    System.out.print("Nama pesanan: ");
                    String namaPesanan = dimas.next();
                    System.out.print("Harga: ");
                    double hargaPesanan = dimas.nextDouble();
            
                    pesananUpdate.namaPesanan = namaPesanan;     
                    pesananUpdate.harga = hargaPesanan;  

                    System.out.println("Pesanan nomor " + nomorUpdate + " telah diperbarui.");
                } else {
                    System.out.println("Nomor antrian tidak valid.");
                }
                break;

                case 4:
                    if (totalAntrian == 0) {
                        System.out.println("Antrian kosong.");
                    } else {
                        for (int i = 0; i < totalAntrian - 1; i++) {
                            for (int j = 0; j < totalAntrian - i - 1; j++) {
                                if (antrian[j].getNamaPesanan().compareTo(antrian[j + 1].getNamaPesanan()) > 0) {
                                    Pesanan14 tempPesanan = antrian[j];
                                    antrian[j] = antrian[j + 1];
                                    antrian[j + 1] = tempPesanan;
                                }
                            }
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("Daftar Pesanan Masuk Resto Royal Delish:");
                        System.out.println("-------------------------------------------");
                        System.out.println("|No  |\tNama Pesanan  |\tHarga");
                        for (int i = 0; i < totalAntrian; i++) {
                            Pesanan14 pesan = antrian[i];
                            System.out.println( "|" + (i + 1) + "  |\t" + pesan.getNamaPesanan() + "        |\t" + pesan.getHarga());
                        }
                        System.out.println("Semua Pesanan Berhasil Dicetak");
                    }
                    break;

                case 5:
                    double totalPendapatan = 0;
                    for (int i = 0; i < totalAntrian; i++) {
                        totalPendapatan += antrian[i].getHarga();
                    }
                    System.out.println("-------------------------------------------");
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println("-------------------------------------------");
                    System.out.println("Pendapatan Hari Ini : Rp. " + totalPendapatan);
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } while (true);
    }
}
