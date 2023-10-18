package praktikum7;

public class SLLtugas2Main {
    public static void main(String[] args) {
        SLLTugas2 singLL = new SLLTugas2();
    
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a','b');
        singLL.print();
        singLL.insertAt(2, 'c');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
    
        System.out.println("Maka Penambahan data sudah sesuai seperti berikut ini");
        singLL.print();
    }
}
