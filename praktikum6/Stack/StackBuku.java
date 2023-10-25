package praktikum6;

public class StackBuku {
    int size;
    int top;
    Buku data[];
    
    public StackBuku (int size){
        this.size = size;
        data = new Buku[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public void push (Buku dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Buku x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.judul + " " +
                x.namaPengarang + " " + x.tahunTerbit + " " + x.jmlHalaman + " ");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas : " + data[top].judul + " " + 
            data[top].namaPengarang + " " +  data[top].tahunTerbit + " " + 
            data[top].jmlHalaman + " " +  data[top].harga + " ");
    }

    public void print(){
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].judul+ " " + data[i].namaPengarang+ " " +
            data[i].tahunTerbit+ " " +data[i].jmlHalaman+ " " + data[i].harga+ " ");
        }
        System.out.println("");
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
