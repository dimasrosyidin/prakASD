public class psgpanjangMain {
    public static void main(String[] args) {
      
        psgpanjang[][] dataPsgpanjang = new psgpanjang[1][2];

        dataPsgpanjang[0][0] = new psgpanjang(30, 20);
        dataPsgpanjang[0][1] = new psgpanjang(50, 22);
       

        System.out.println("Lebar persegi panjang di baris 1 kolom 0: " + dataPsgpanjang[0][0].lebar);
        System.out.println("Tinggi persegi panjang di baris 2 kolom 1: " + dataPsgpanjang[0][1].tinggi);
    }
    
}
