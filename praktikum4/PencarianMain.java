package praktikum4;
import java.util.Scanner;
public class PencarianMain {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jumlah elemen array: ");
            int n = scanner.nextInt();
            double[] data = new double[n];
            System.out.println("Masukkan data elemen array: ");
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextDouble();
            }
            OrderedSearch os = new OrderedSearch(data);
            System.out.println("Elemen array: ");
            os.tampilkan();
            System.out.print("Masukkan elemen array yang dicari : ");
            double key = scanner.nextDouble();
            int index = os.cari(key);
        if(index!=-1){
            System.out.println("Data "+ key + "pada index "+ index);
            } else{
                System.out.println("Data "+key+"tidak ditemukan");
            }
        }
}
