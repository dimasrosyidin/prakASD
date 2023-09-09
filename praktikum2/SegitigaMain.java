package praktikum2;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] sgarray = new Segitiga [4];

        sgarray [0] = new Segitiga (10, 4);
        sgarray [1] = new Segitiga (20, 10);
        sgarray [2] = new Segitiga (15, 6);
        sgarray [3] = new Segitiga (25, 10);
        
        for (int i = 0; i< 4 ; i++)
        {
            System.out.println("Luas Segitiga ke-" + i + ": " + sgarray[i].hitungLuas());
            System.out.println("===========\n");
            System.out.println("Keliling Segitiga ke-" + i + ": " + sgarray[i].hitungKeliling());

        }
    }
    
}
