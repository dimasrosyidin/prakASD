package praktikum5;

public class DaftarAnggotaPaskibraka {
    Paskibraka listPeserta[] = new Paskibraka[10];
    int id;

    void tambah(Paskibraka p){
        if(id<listPeserta.length){
            listPeserta[id] = p;
            id++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Paskibraka p : listPeserta){
            if (p != null && p.tinggi > 170) {
            p.tampil();
            System.out.println("--------------------------------------");
        }
    }

  
}
void Sorting(){
    for(int i = 0 ; i<listPeserta.length; i++){
        for(int j=1; j<listPeserta.length-i; j++){
            if(listPeserta[j].tinggi>listPeserta[j-1].tinggi){
                Paskibraka tmp = listPeserta[j];
                listPeserta[j] = listPeserta[j-1];
                listPeserta[j-1] = tmp;
            }
        }
    }
}
}
