package praktikum4;

public class Tugas3Main {

    public static void main(String[] args) {
        int bil[] = {12,15, 6, 3, 70, 51, 83, 15, 3, 83};
        Tugas3 arry = new Tugas3 (bil);
        
        System.out.println("DATA ELEMEN ARRAY");
        arry.tampil();
        System.out.println("___________________________________________________");
        arry.nilaiTerbesar();
        arry.tampilPosisi(0);
    }
}

