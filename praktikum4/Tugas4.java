package praktikum4;

public class Tugas4 {
    String nik;
    String nama;
    String alamat;
    String jenisKelamin;

    public Tugas4(String nik, String nama, String alamat, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String cariNik() {
        return nik;
    }

    public String cariNama() {
        return nama;
    }

    public String cariAlamat() {
        return alamat;
    }

    public String cariJenisKelamin() {
        return jenisKelamin;
    }
}

