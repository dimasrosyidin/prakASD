package tugas;

public class Mahasiswa {
    private String NIM;
    private String namaLengkap;
    private String jurusan;
    private String programStudi;

    public Mahasiswa(String NIM, String namaLengkap, String jurusan, String programStudi) {
        this.NIM = NIM;
        this.namaLengkap = namaLengkap;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
