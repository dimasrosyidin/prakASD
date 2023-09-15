package praktikum3;

public class latihan {
    public int suara;
    public int Jmlkandidat = 4;
    public int jmlSuara;
    public String namaKandidat;

    public static int n, a;
    public static int seleksi = 0;

    public static int[] arr = new int[1000];
    public static int hasilPemilihan(int js, int kdd1, int kdd2, int kdd3, int kdd4) {
        
        if (n == 4) {
            return 1;
        }

        if (n == 1 && kdd1 < 0) {
            arr[seleksi] = n;
            seleksi++;
            n++;
            return hasilPemilihan(js, kdd1 - 1, kdd2, kdd3, kdd4);
        } else if (n == 2 && kdd2 < 0) {
            arr[seleksi] = n;
            seleksi++;
            n++;
            return hasilPemilihan(js, kdd1, kdd2 - 1, kdd3, kdd4);
        } else if (n == 3 && kdd3 < 0) {
            arr[seleksi] = n;
            seleksi++;
            n++;
            return hasilPemilihan(js, kdd1, kdd2, kdd3 - 1, kdd4);
        } else if (n == 4 && kdd4 < 0) {
            arr[seleksi] = n;
            seleksi++;
            n++;
            return hasilPemilihan(js, kdd1, kdd2, kdd3, kdd4 - 1);
        } else if (kdd1 == 0 && kdd2 == 0 && kdd3 == 0 && kdd4 == 0) {
            if (arr[a] == arr[a + 1] && a + 1 < js) {
                return arr[a];

            } else if (a + 2 > js) {
                a += 2;
                return hasilPemilihan(js, kdd1, kdd2, kdd3, kdd4);
            } else {
                return 0;
        }
        } else {
            n++;
            return hasilPemilihan(js, kdd1, kdd2, kdd3, kdd4);
        }
    }
}
