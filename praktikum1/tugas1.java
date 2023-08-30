import java.util.Scanner;

import javax.swing.ToolTipManager;
public class tugas1 {
    public static void main(String[] args) {

    int [] beratBaju = {4,15,6,11};
    String [] customer = {"Ani", "Budi", "Bina","Cita"};
    int tarif = 4500;
    double diskon = 0.5;
    double disc, total, pendapatan = 0;
    
    for (int i = 0; i < beratBaju.length; i++) {
        if (beratBaju[i] > 10){
           disc = beratBaju[i]*4500;
           total = (int) (disc - (disc*0.05));
        }else {
           total = beratBaju[i]*4500;
        }
        System.out.println("");
        pendapatan += total;
        System.out.println(" Nama Customer    : " + customer[i]);
        System.out.println(" Total Berat Baju : " + beratBaju[i]);
        System.out.println(" Total Pembayaran : " + total);
    }
    System.out.println();
    System.out.println(" Total Pendapatan Smile Laundry Adalah :" + pendapatan);
    
}
}

