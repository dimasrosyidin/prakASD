package praktikum7;

public class SLLTugas3 {
    nodeTugas3 head; //posisi awal linked list
    nodeTugas3 tail; //posisi akhir linked list

    public boolean isEmpty() {
    return head == null;
    }
    public void pr(){
        if(!isEmpty()){
            nodeTugas3 tmp = head;
            System.out.println("Berhasil menambahkan "+ tmp.data);
        }
    }
    public void print(){
        if(!isEmpty()){
            nodeTugas3 tmp = head;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void peek(){
        if(!isEmpty()){
            nodeTugas3 tmp = head;
            System.out.println("Elemen Teratas : "+tmp.data);
        }else{
        System.out.println("Stack Masih Kosong");
        }
    }
    public void push(String input){
        nodeTugas3 ndInput = new nodeTugas3(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
