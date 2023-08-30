import java.util.Scanner;
public class pemilihan{
    public static void main (String [] args) {
        Scanner sc =new Scanner(System.in);
        double nilai1, nilai2, nilai3,ratarata;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.print("Masukkan Nilai Tugas: ");
        nilai1 = sc.nextDouble ();
        System.out.print("Masukkan Nilai UTS: ");
        nilai2 = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilai3 = sc.nextDouble();


        ratarata = (nilai1*0.2+ nilai2*0.35+ nilai3*0.45);
        System.out.println("Nilai akhir : " + ratarata);
        
        if (ratarata > 80){
            System.out.println("Nilai Huruf : A");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (ratarata > 73) {
            System.out.println("Nilai Huruf : B+");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (ratarata > 65) {
            System.out.println("Nilai Huruf : B");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (ratarata > 60) {
            System.out.println("Nilai Huruf : C+");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (ratarata > 50) {
            System.out.println("Nilai Huruf : C");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (ratarata > 39) {
            System.out.println("Nilai Huruf : D");
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }
        else if (ratarata <= 39) {
            System.out.println("Nilai Huruf : E");
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }

        }
    }