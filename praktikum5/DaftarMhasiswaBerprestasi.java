package praktikum5;

public class DaftarMhasiswaBerprestasi {
    Mahasiswa lisMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<lisMhs.length){
            lisMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa m : lisMhs){
            m.tampil();
            System.out.println("--------------------------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0 ; i<lisMhs.length; i++){
            for(int j=1; j<lisMhs.length-i; j++){
                if(lisMhs[j].ipk>lisMhs[j-1].ipk){
                    Mahasiswa tmp = lisMhs[j];
                    lisMhs[j] = lisMhs[j-1];
                    lisMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i=0; i<lisMhs.length-1; i++){
            int idxmin=i;
            for (int j=i+1; j<lisMhs.length; j++){
                if (lisMhs[j].ipk > lisMhs[idxmin].ipk){
                    idxmin=j;
                }
            }
            Mahasiswa tmp = lisMhs[idxmin];
            lisMhs[idxmin] = lisMhs[idxmin];
            lisMhs[i] = tmp;
        }
    }
}
