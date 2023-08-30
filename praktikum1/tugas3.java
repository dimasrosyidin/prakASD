import java.util.Scanner;
public class tugas3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan n: ");
        int n = sc.nextInt();

        int a = 0;
        int mulai = 2;
        
        System.out.print("Outputnya : ");
        while (a < n) {
            if (mulai % 4 != 0) {
                System.out.print(mulai + ",");
                a++;
            }
            mulai += 2;
        }

    }
}
