package praktikum4;
import java.util.Scanner;
public class Tugas1Main {
    public static void main (String[] args){
        int[] data = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        Tugas1 os= new Tugas1 (data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan elemen array yang dicari: ");
        int key = sc.nextInt();
        int index = os.cari(key);
        if(index!=-1){
            System.out.println("Data "+ key + " pada index "+ index);
            } else{
                System.out.println("Data "+key+" tidak ditemukan ");
            }
        }
}

