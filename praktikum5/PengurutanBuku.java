package praktikum5;

public class PengurutanBuku {
    public Buku[] data;
    public int jumData;

    public PengurutanBuku(Buku[] Data, int jmlData) {
        jumData = jmlData;
        data = new Buku[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubblesort(String kolom) {
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - i - 1; j++) {
                if (kolom.equals("UkuranBuku")) {
                    if (data[j].ukuranBuku > data[j + 1].ukuranBuku) {
                        Buku temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                } else if (kolom.equals("JumlahHalaman")) {
                    if (data[j].jumlahHalaman > data[j + 1].jumlahHalaman) {
                        Buku temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
    }

    void selectionSort(String kolom) {
        for (int i = 0; i < jumData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jumData; j++) {
                if (kolom.equals("UkuranBuku")) {
                    if (data[j].ukuranBuku < data[min].ukuranBuku) {
                        min = j;
                    }
                } else if (kolom.equals("JumlahHalaman")) {
                    if (data[j].jumlahHalaman < data[min].jumlahHalaman) {
                        min = j;
                    }
                }
            }
            Buku temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.println("Judul Buku = " + data[i].judul);
            System.out.println("Jumlah Halaman = " + data[i].jumlahHalaman);
            System.out.println("Ukuran Buku (cm) = " + data[i].ukuranBuku);
            System.out.println();
        }
    }
}

