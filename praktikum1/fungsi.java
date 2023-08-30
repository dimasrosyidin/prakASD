public class fungsi {
    public static void fiboPerulangan(int n) {
        int fb = 0;
        int fbnc = 1;
        
        System.out.print("Fibonacci Perulangan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fb + " ");
            int j = fb + fbnc;
            fb = fbnc;
            fbnc = j;
        }
        System.out.println();
    }
    
    public static int rekursif(int n) {
        if (n <= 1) {
            return n;
        }
        return rekursif(n - 1) + rekursif(n - 2);
    }
    
    public static void fiborekursif(int n) {
        System.out.print("Fibonacci Rekursif : ");
        for (int i = 0; i < n; i++) {
            System.out.print(rekursif(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n = 10; 
        fiboPerulangan(n);
        fiborekursif(n);
    }
}
