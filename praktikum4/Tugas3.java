package praktikum4;

public class Tugas3 {

    public int [] data;
    public int maks = 0;
    public int posisi;
    public int jumlah = 0;
    
    Tugas3(int nilai[]){
        data = nilai;
    }
    void tampil(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
   
    public int nilaiTerbesar(){
        for(int i=0; i<data.length; i++){
            if(data[i] > maks){
                maks = data[i];
            }
        }
        System.out.println("Nilai terbesar adalah\t\t: "+maks);
        return maks;
    }
    public void tampilPosisi(int pos){
        for(int i=0; i<data.length; i++){
            if(data[i] == maks){
                jumlah++;
            }
        }
        System.out.println("Yang Berjumlah\t\t\t: "+jumlah+" Bilangan");
        System.out.println();
        posisi = maks;
        for(int i=0; i<data.length; i++){
            if(posisi == data[i]){
                pos = i;
                System.out.println("Data Ditemukan pada Indeks ke-\t: "+pos);
            }
        }
    }
}

