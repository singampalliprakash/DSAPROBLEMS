public class DoublyList {

    // Node class representing each element of the list
    class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head and tail of the list
    private Node head;
    private Node tail;

    // Constructor for initializing empty list
    public DoublyList() {
        this.head = null;
        this.tail = null;
    }

    // Insert node at the beginning
    public void insertAtBeg(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert node at the end
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Print all elements from head to tail
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyList d1 = new DoublyList();

        d1.print(); // Initially empty

        d1.insertAtBeg("java");
        d1.insertAtBeg("js");
        d1.insertAtEnd("python");
        d1.insertAtBeg("html");

        d1.print(); // Output: html js java python
    }
}
