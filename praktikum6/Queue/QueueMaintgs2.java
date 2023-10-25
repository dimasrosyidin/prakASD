import java.util.Scanner;

public class QueueMaintgs2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        Queuetgs2 antrian = new Queuetgs2(kapasitas);
        
        sc.nextLine(); 
        
        int pilih;
        do {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue ");
            System.out.println("3. Peek ");
            System.out.println("4. Peek Rear ");
            System.out.println("5. Peek Position ");
            System.out.println("6. Print Mahasiswa Pada Posisi Tertentu");
            System.out.println("7. Print (Tampilkan Semua Mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();

            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan absen mahasiswa: ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan IPK mahasiswa: ");
                    double ipk = sc.nextDouble();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    antrian.enqueue(mhs);
                    System.out.println("Mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    int absenKeluar = antrian.dequeue();
                    if (absenKeluar != -1) {
                        System.out.println("Mahasiswa dengan absen " + absenKeluar + " telah dikeluarkan dari antrian.");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    sc.nextLine(); 
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimCari = sc.nextLine();
                    antrian.peekPosition(nimCari);
                    break;
                case 6:
                    System.out.print("Masukkan posisi mahasiswa: ");
                    int posisi = sc.nextInt();
                    antrian.printMahasiswa(posisi);
                    break;
                case 7:
                    antrian.print();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 0);

        sc.close();
    }
}

