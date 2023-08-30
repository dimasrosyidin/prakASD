import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.print("Masukkan NIM : ");
        String nim1 = scanner.nextLine();
        System.out.print("Masukkan dua angka terakhir NIM : ");
        int nim = scanner.nextInt();
        
        if (nim < 10) {
            nim += 10;
        }
        
        for (int i = 0; i < nim; i++) {
            String hari1 = hari[i % 7];
            System.out.print(hari1 + ",");
        }
    }
    
}
