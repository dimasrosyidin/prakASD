package praktikum4;

public class Tugas1 {
    public int[] arr;
    
    public Tugas1(int arrayNilai[]) {
        arr = new int[arrayNilai.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayNilai[i];
        }
    }

    public int cari(int keyword) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (keyword == arr[i]) {
                index = i;
                break;
            } else {
                if (keyword < arr[i]) {
                    break;
                }
            }
        }
        return index;
    }

    public void tampilkan() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
