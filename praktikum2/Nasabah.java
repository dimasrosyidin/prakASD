package praktikum2;

public class Nasabah {
    private String nama;
    private String alamat;
    private int noHP;
    private int noRek;
    private int saldo;
    private float jmlHutang;
    private boolean statusAktif;

    public Nasabah(String nama, String alamat, int noHP, int noRek) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.noRek = noRek;
        this.saldo = 0; 
        this.jmlHutang = 0; 
        this.statusAktif = false;
        
    }

    public int lihatSaldo() {
        return saldo;
    }

    public int menabung(int deposit) {
        if (statusAktif) {
            saldo += deposit;
        }
        return saldo;
    }

    public int tarikTunai(int jmlTarik) {
        if (statusAktif && saldo >= jmlTarik) {
            saldo -= jmlTarik;
        }
        return saldo;
    }

    public void bukaRekening() {
        statusAktif = true;
    }

    public void tutupRekening() {
        statusAktif = false;
    }

    public void berhutang(int jmlHutang) {
        if (statusAktif && jmlHutang <= saldo) {
            this.jmlHutang = jmlHutang;
            float cicilanPerBulan = (float) jmlHutang / 6;
            System.out.println("Pinjaman disetujui.");
            System.out.println("Simulasi skema cicilan per bulan: " + cicilanPerBulan);
        } else {
            System.out.println("Ajuan peminjaman ditolak.");
        }
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public int getNoHp() {
        return noHP;
    }
    public int getNoRek() {
        return noRek;
    }
}
