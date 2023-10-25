public class Tugas2stack {
    int size,top;
    int[] noTransaction, sumItem, sumPrice;
    String[] dateBuy;

    public Tugas2stack(int sumReceipt){
        noTransaction = new int[sumReceipt];
        sumItem = new int[sumReceipt];
        sumPrice = new int[sumReceipt];
        dateBuy = new String[sumReceipt];
        size = sumReceipt;
        top = -1;
    }
    
    public void inputReceipt(int noTransaction, String dateBuy,int sumItem, int sumPrice){
        if(isFull()){
            System.out.println("Data Struk Sudah Penuh!");
        } else{
            top++;
            this.noTransaction[top] = noTransaction;
            this.dateBuy[top] = dateBuy;
            this.sumItem[top] = sumItem;
            this.sumPrice[top] = sumPrice;
        }
    }

    public boolean isFull(){
        if(top == (size-1)){
            System.out.println("Data sudah penuh!");
            return true;
        } else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            System.out.println("Data masih kosong!");
            return true;
        } else{
            return false;
        }
    }

    public void takeTopReceipt(){
        if(isEmpty()){
            System.out.println("Data Struk Masih Kosong!");
        } else{
            System.out.println("Struk yang diambil: ");
            System.out.println("No Transaksi  : "+ noTransaction[top]);
            System.out.println("Tanggal Beli  : "+ dateBuy[top]);
            System.out.println("Jumlah Barang : "+ sumItem[top]);
            System.out.println("Total Harga   : "+ sumPrice[top]);
            top--;
            System.out.println();
        }
    }

    public void peekTopReceipt(){
        if(isEmpty()){
            System.out.println("Data Struk Masih Kosong!");
        } else{
            System.out.println("Struk Paling Atas: ");
            System.out.println("No Transaksi  : "+ noTransaction[top]);
            System.out.println("Tanggal Beli  : "+ dateBuy[top]);
            System.out.println("Jumlah Barang : "+ sumItem[top]);
            System.out.println("Total Harga   : "+ sumPrice[top]);
            System.out.println();
        }
    }

    public void peekAllReceipt(){
        for(int i=top; i>=0;i--){
            System.out.println("No Transaksi  : "+ noTransaction[i]);
            System.out.println("Tanggal Beli  : "+ dateBuy[i]);
            System.out.println("Jumlah Barang : "+ sumItem[i]);
            System.out.println("Total Harga   : "+ sumPrice[i]);
            System.out.println();

        }
    }
}

