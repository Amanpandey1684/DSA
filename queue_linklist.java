
public class queue_linklist {
    Node front;
    Node rare;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rare = newNode;
            return;
        }
        rare.next = newNode;
        rare = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rare = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node last = front;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        queue_linklist queue = new queue_linklist();
        queue.enqueue(3);
        queue.display();
    }
}