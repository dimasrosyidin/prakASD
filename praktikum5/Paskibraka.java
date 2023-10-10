package praktikum5;

public class Paskibraka {
    String nama;
    String kelas;
    int tinggi;

    Paskibraka (String nama, String kelas, int tinggi){
        this.nama=nama;
        this.kelas=kelas;
        this.tinggi=tinggi;
    }

    void tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Kelas = "+ kelas);
        System.out.println("Tinggi = " + tinggi);
    }
}
