package praktikum7;

public class SingleLinkedList {
    Node head;
    Node tail;
    
    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if (!IsEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List : \t");
            while (tmp !=null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (IsEmpty()){
            head = ndInput;
            tail =ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if (IsEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAT (int index, int input){
        if (index < 0){
            System.out.println("indeks salah");
        } else if (index == 0){
            addFirst(input);
        }else {
            Node temp = head;
            for (int i = 0; i<index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next==null) tail=temp.next;
    }
    
}
    public int getData(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp !=null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else {
            return index;
        }
    }

    public void removeFirst(){
        if (IsEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if (IsEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next !=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;

        }
    }
    public void remove(int key){
        if (IsEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
    } else {
        Node temp = head;
        while (temp != null){
            if ((temp.data == key) &&( temp == head)){
                this.removeFirst();
                break;
            } else if (temp.next.data == key){
                temp.next = temp.next.next;
                if (temp.next == null){
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        }
     }
    }

    public void removeAt (int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }

    public void insertBefore(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        Node prev = null;
    
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }

}
