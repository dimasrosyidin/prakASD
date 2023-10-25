import java.util.Scanner;

public class QueuePenumpangMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        QueuePenumpang antri = new QueuePenumpang(jumlah);

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Kota Asal : "); 
                    String kotaAsal = sc.nextLine();
                    System.out.print("Kota Tujuan : ");  
                    String kotaTujuan = sc.nextLine();
                    System.out.print("Jumlah Tiket : ");  
                    int jml = sc.nextInt();
                    System.out.print("Harga : ");  
                    int harga = sc.nextInt();
                    Penumpang p = new Penumpang(nama, kotaAsal, kotaTujuan, jml, harga);  
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) && data.jumlahTiket != 0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga); 
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print(); 
                    break;
                case 5:
                    Penumpang rearData = antri.peekRear();
                    if (rearData != null) {
                        System.out.println("Antrian paling belakang : " + rearData.nama + " " + rearData.kotaAsal + " " + rearData.kotaTujuan + " " + rearData.jumlahTiket + " " + rearData.harga);
                    } else {
                        System.out.println("Queue masih kosong");
                    }
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");  
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("----------------------------------");
    }
}