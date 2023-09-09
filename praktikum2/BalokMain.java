package praktikum2;

public class BalokMain {
    public static void main(String[] args) {
        Balok[] blarray = new Balok [3];

        blarray[0] = new Balok(100, 30, 12);
        blarray[1] = new Balok(120, 40, 15);
        blarray[2] = new Balok(210, 50, 25);

        for (int i = 0; i< 3 ; i++)
        {
            System.out.println("Volume balok ke-" + i + ": " + blarray[i].hitungVolume());
        }
    }
    
}
