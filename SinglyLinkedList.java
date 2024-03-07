public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void tambahDepan(Buku data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void tambahBelakang(Buku data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void hapusDepan() {
        if (this.head == null) {
            System.out.println("Buku tidak tersedia");
            return;
        }
        this.head = this.head.next;
    }

    public void hapusBelakang() {
        if (this.head == null) {
            System.out.println("Buku tidak tersedia");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void printBuku() {
        Node current = this.head;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }
}
