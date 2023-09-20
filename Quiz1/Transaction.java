public class Transaction {
        String[] Namaitem;
        int[] itemQty;
        double[] HrgItem;
        int TtlItem;

        public Transaction() {
            Namaitem = new String[50]; 
            itemQty = new int[50];
            HrgItem = new double[50];
            TtlItem = 0;
        }
        
    public void add_item(String NamaItem, int JumlahItem, double HargaPerItem) {
        Namaitem [TtlItem] = NamaItem;
        itemQty[TtlItem] = JumlahItem;
        HrgItem[TtlItem] = HargaPerItem;
        TtlItem++;
    }

    public void update_item_name(String namaItem, String updateNamaItem) {
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null && Namaitem[i].equals(namaItem)) {
                Namaitem[i] = updateNamaItem;
                return;
            }
        }
        System.out.println("item tidak ditemukan.");
    }
    public void update_item_qty(String nmITEM, int updateJmlItem) {
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null && Namaitem[i].equals(nmITEM)) {
                itemQty[i] = updateJmlItem;
                return;
            }
        }
        System.out.println("Item tidak ditemukan.");
    }

    public void update_item_price(String namaITEM, double updateHrgItem) {
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null && Namaitem[i].equals(namaITEM)) {
                HrgItem[i] = updateHrgItem;
                return;
            }
        }
        System.out.println("Item tidak ditemukan.");
    }

    public void delete_item(String NmItem) {
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null && Namaitem[i].equals(NmItem)) {
                Namaitem[i] = null;
                itemQty[i] = 0;
                HrgItem[i] = 0;
                return;
            }
        }
        System.out.println("Item tidak ditemukan.");
    }
    public void check_order() {
        System.out.println("PESANAN ANDA SUDAH BENAR : ");
        System.out.println("| No\t| Nama Item\t| Jumlah Item\t| Harga/Item\t| Total\t|");
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null) {
                double totalPerItem = itemQty[i] * HrgItem[i];
                System.out.println("| " + (i + 1) + "\t| " + Namaitem[i] + "\t\t| " + itemQty[i] + "\t\t| " + HrgItem[i] + "\t\t| " + totalPerItem + "\t|");
            }
        }
        double total = total_price();
        System.out.println("| \t Total Harga\t|\t\t\t\t| " + total + "\t|");
    }

    public double total_price() {
        double totalHarga = 0;
        double HrgDisc = 0;
        for (int i = 0; i < TtlItem; i++) {
            if (Namaitem[i] != null) {
                totalHarga += itemQty[i] * HrgItem[i];
            }
        }

        if (totalHarga > 500000) {
            HrgDisc = totalHarga - (totalHarga * 0.1) ; 
            return HrgDisc;
        } else if (totalHarga > 300000) {
            HrgDisc = totalHarga - (totalHarga * 0.1) ; 
            return HrgDisc;

        } else if (totalHarga > 200000) {
            HrgDisc = totalHarga - (totalHarga * 0.1) ; 
            return HrgDisc;
        } else {
            return totalHarga;
        }
    }



    }

