import java.util.Scanner;
public class Tugas2MainStacks {
        public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.print("Masukkan jumlah struk: ");
        int sumReceipt = scInt.nextInt();
        Tugas2stack tgs2 = new Tugas2stack(sumReceipt);

        for(int i=0; i<sumReceipt; i++){
            System.out.println("===============================================");
            System.out.println("STRUK KE-"+(i+1));
            System.out.print("Masukkan nomor transaksi: ");
            int noTransaction = scInt.nextInt();
            System.out.print("Masukkan tanggal transaksi: ");
            String dateBuy = scString.nextLine();
            System.out.print("Masukkan jumlah barang: ");
            int sumItem = scInt.nextInt();
            System.out.print("Masukkan total harga: ");
            int sumPrice = scInt.nextInt();
            tgs2.inputReceipt(noTransaction, dateBuy, sumItem, sumPrice);
            System.out.println();
        }
        int pilih;
        do{
            System.out.println("===============================================");
            System.out.println("                    MENU                       ");
            System.out.println("===============================================");
            System.out.println("1. Lihat Semua Struk");
            System.out.println("2. Lihat Struk Paling Atas");
            System.out.println("3. Ambil Struk Paling Atas");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Berdasarkan Nomor: ");
            pilih = scInt.nextInt();
            switch(pilih){
                case 1:
                    tgs2.peekAllReceipt();
                    break;
                case 2:
                    tgs2.peekTopReceipt();
                    break;
                case 3:
                    tgs2.takeTopReceipt();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("MENU TIDAK ADA");
                    System.out.println();
                    break;
            }
        }while(pilih != 4);
    }
}