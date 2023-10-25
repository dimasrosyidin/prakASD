import java.util.Scanner;
public class Tugas1MainStack {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String word = sc.nextLine();
        Tugas1stack tgs1 = new Tugas1stack(word.length());
        tgs1.inputReverseWord(word);
        System.out.println("Hasil: ");
        tgs1.printReverseWord();
    }
}