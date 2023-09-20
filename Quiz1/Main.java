import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Transaction trnsct_123 = new Transaction();
    Scanner scanner = new Scanner(System.in);

    String lanjutPesan = "y";

    while (lanjutPesan.equalsIgnoreCase("y")) {
        
        System.out.print("Masukkan Pesanan Nama Item: ");
        String Namaitem = scanner.nextLine();

        System.out.print("Masukkan Pesanan Jumlah Item: ");
        int itemQty = scanner.nextInt();

        System.out.print("Masukkan harga per item: ");
        double HrgItem = scanner.nextDouble();

        trnsct_123.add_item(Namaitem, itemQty, HrgItem);

        System.out.print("Apakah Anda ingin menambahkan item lain? ya/tidak (y/t): ");
        scanner.nextLine(); 
        lanjutPesan = scanner.nextLine();
    }

    trnsct_123.check_order();

}
}