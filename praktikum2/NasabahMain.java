package praktikum2;

public class NasabahMain {
    public static void main(String[] args) {
        Nasabah[] daftarNasabah = new Nasabah[2];
    
        daftarNasabah[0] = new Nasabah("Dimas", "Mojokerto", 224176005, 1111);
        daftarNasabah[0].bukaRekening();
        daftarNasabah[0].menabung(7000);
        System.out.print("Nasabah Dimas : ");
        daftarNasabah[0].berhutang(1000);
        daftarNasabah[0].tarikTunai(700);
        daftarNasabah[0].tutupRekening();
        daftarNasabah[1] = new Nasabah("Rosyidin", "malang", 234468909, 1000);
        daftarNasabah[1].bukaRekening();
        daftarNasabah[1].menabung(1000);
        System.out.print("Nasabah Rosyidin : ");
        daftarNasabah[1].berhutang(2000);
        daftarNasabah[1].tarikTunai(300);
        daftarNasabah[1].tutupRekening();

        for (int i = 0; i < daftarNasabah.length; i++) {
            System.out.println("Nasabah  ke -" + (i + 1));
            System.out.println("Nama Nasabah   : " + daftarNasabah[i].getNama());
            System.out.println("Nomor Rekening : " + daftarNasabah[i].getNoRek());
            System.out.println("Alamat         : " + daftarNasabah[i].getAlamat());
            System.out.println("Nomor Telepon  : " + daftarNasabah[i].getNoHp());
            System.out.println("Saldo          : " + daftarNasabah[i].lihatSaldo());      
    }
    }
}


