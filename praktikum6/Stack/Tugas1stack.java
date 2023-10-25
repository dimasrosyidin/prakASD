public class Tugas1stack {
    int lengthWord, top;
    char[] reversWord;

    public Tugas1stack(int length){
        lengthWord = length;
        reversWord = new char[lengthWord];
        top = -1;
    }
    
    public void inputReverseWord(String word){
        for(int i=0; i<lengthWord; i++){
            reversWord[i] = word.charAt(i);
            top++;
        }
    }

    public void printReverseWord(){
        for(int i=top; i>=0; i--){
            System.out.print(reversWord[i]);
        }
    }
}

