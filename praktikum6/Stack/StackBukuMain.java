package praktikum6;
import java.util.Scanner;
public class StackBukuMain {
    public static void main(String[] args) {
    StackBuku st = new StackBuku(5);
    Scanner sc = new Scanner(System.in);
    char pilih;
    do {
        System.out.print("judul : ");
        String judul = sc.nextLine();
        System.out.print("Nama Pengarang : ");
        String nama = sc.nextLine();
        System.out.print("Tahun Terbit : ");
        int tahun = sc.nextInt();
        System.out.print("Jumlah Halaman : ");
        int jml = sc.nextInt();
        System.out.print("Harga : ");
        int hrg = sc.nextInt();

        Buku bk = new Buku(judul, nama, tahun, jml, hrg);
        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        st.push(bk);
    }while (pilih == 'y');

    st.print();
    st.pop();
    st.peek();
    st.print();;
}
}