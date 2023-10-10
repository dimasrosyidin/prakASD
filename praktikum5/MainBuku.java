package praktikum5;

public class MainBuku {
    public static void main(String[] args) {
        Buku[] dataBuku = new Buku[4];
        dataBuku[0] = new Buku("Algoritma Pemrograman", 1292, 25);
        dataBuku[1] = new Buku("Basis data", 400, 35);
        dataBuku[2] = new Buku("Dasar Pemrograman", 294, 29.7);
        dataBuku[3] = new Buku("Rekayasa Perangkat Lunak", 824, 70.7);

        PengurutanBuku urutUkuran = new PengurutanBuku(dataBuku, dataBuku.length);
        PengurutanBuku urutHalaman = new PengurutanBuku(dataBuku, dataBuku.length);

        System.out.println("Data Buku Sebelum Sorting:");
        urutUkuran.tampilData();
        urutUkuran.bubblesort("UkuranBuku"); 
        System.out.println("Data Buku Setelah Sorting berdasarkan UkuranBuku:");
        urutUkuran.tampilData();

        System.out.println("\nData Buku Sebelum Sorting:");
        urutHalaman.tampilData();
        urutHalaman.selectionSort("JumlahHalaman");
        System.out.println("Data Buku Setelah Sorting berdasarkan JumlahHalaman:");
        urutHalaman.tampilData();
    }
}


