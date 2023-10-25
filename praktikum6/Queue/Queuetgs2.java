public class Queuetgs2 {
    int max;
    int front;
    int rear;
    int size;
    Mahasiswa[] antrian;

    public Queuetgs2(int max) {
        this.max = max;
        create();
    }

    public void create() {
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }

        antrian[rear] = data;
        size++;
    }

    public int dequeue() {
        int data = -1;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = antrian[front].absen;
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("NIM: " + antrian[i].nim + ", Nama: " + antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println("NIM: " + antrian[i].nim + ", Nama: " + antrian[i].nama);
            System.out.println("Jumlah mahasiswa = " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan - NIM: " + antrian[front].nim + ", Nama: " + antrian[front].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling belakang - NIM: " + antrian[rear].nim + ", Nama: " + antrian[rear].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (antrian[index].nim.equals(nim)) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi antrian ke-" + i);
                    return;
                }
            }
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!isEmpty() && posisi >= 0 && posisi < size) {
            int index = (front + posisi) % max;
            System.out.println("Data Mahasiswa pada posisi " + posisi + ":");
            System.out.println("NIM: " + antrian[index].nim);
            System.out.println("Nama: " + antrian[index].nama);
            System.out.println("Absen: " + antrian[index].absen);
            System.out.println("IPK: " + antrian[index].ipk);
        } else {
            System.out.println("Posisi tidak valid atau antrian masih kosong");
        }
    }
}

