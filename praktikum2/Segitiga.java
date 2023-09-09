package praktikum2;

import java.util.Scanner;
public class Segitiga {
    Scanner sc = new Scanner(System.in);
    public int alas;
    public int tinggi;
    public double sisiMiring;
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisiMiring = 0;
    }

    public Segitiga (int a , int t)
    {
        alas = a;
        tinggi = t;
        sisiMiring = Math.sqrt(a * a + t * t);
      
    }
    public int hitungLuas()
    { 
        return alas * tinggi ;
    }
    public double hitungKeliling()
    { 
        return alas + tinggi + sisiMiring;

    }
}
