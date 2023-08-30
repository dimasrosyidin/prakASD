import java.util.Scanner;
public class tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuPilihan;
        do{
            System.out.println("PROGRAM MENGHITUNG LUAS");
            System.out.println("1. Luas Segitiga ");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran ");
            System.out.println("0. Keluar");
            System.out.print(" Pilih Menu : ");
            menuPilihan = sc.nextInt();
            sc.nextLine(); 
    
            switch (menuPilihan) {
                case 1: 
                    luasSegitiga();
                break;
                case 2:
                    luasPersegiPanjang();
                break;
                case 3:
                    luasLingkaran();
                break;
                case 0:
                System.out.println("Terima kasih Program Telah Selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
            } while (menuPilihan != 0);
        
        }

        public static void luasSegitiga () {
            Scanner sc = new Scanner(System.in);
            System.out.println("LUAS SEGITIGA");
            System.out.print("Masukkan alas : ");
            Double alas = sc.nextDouble();
            System.out.print("Masukkan tinggi : ");
            Double tinggi = sc.nextDouble();
            Double luas = alas * tinggi / 2;
            System.out.println("Luas segitiga : " + luas);
        
        }
        public static void luasPersegiPanjang () {
            Scanner sc = new Scanner(System.in);
            System.out.println("LUAS PERSEGI PANJANG");
            System.out.print("Masukkan panjang : ");
            Double panjang = sc.nextDouble();
            System.out.print("Masukkan tinggi : ");
            Double tinggi = sc.nextDouble();
            Double luas = panjang * tinggi ;
            System.out.println("Luas Persegi Panjang : " + luas);
        
        }

        public static void luasLingkaran() {
            Scanner sc = new Scanner(System.in);
            System.out.println("LUAS LINGKARAN");
            System.out.print("Masukkan Jari - Jari : ");
            Double jariJari = sc.nextDouble();
            Double luas = 3.14 * jariJari * jariJari ;
            System.out.println("Luas Lingkaran : " + luas);
        
        }

    }
