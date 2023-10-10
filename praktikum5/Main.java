package praktikum5;

public class Main {
    public static void main(String[] args) {
        int a[] = {15, 10, 7, 22, 5};
        Sort urut = new Sort(a, a.length);
        System.out.println("Data sebelum urut " );
        urut.tampilData();
        System.out.println("Data sesudah urut Bubble Sort (DESC)");
        urut.bubblesort();
        urut.tampilData();
        System.out.println("Data sesudah urut Selection Sort (DESC)");
        urut.selectionSort();
        urut.tampilData();
      
    }
}
