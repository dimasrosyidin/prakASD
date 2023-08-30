public class tugas2 {
    public static void main(String[] args) {
        int uang = 1000000;
        int bulan = 0;
        double bunga = 0.02;
        double target = 1500000;

        while(uang <= target){
            double totalbunga = uang*bunga;
            uang+=totalbunga;
            bulan++;
        }

        System.out.println("Saldo nasabah akan mencapai Rp. " + uang + " pada bulan ke " +  bulan);
    }

    }