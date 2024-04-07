public class queue_array {
    int front, rear, max;
    int que[];

    queue_array(int size) {
        front = rear = -1;
        max = size;
        que = new int[max];
    }

    void enqueue(int data) {
        if (rear == max - 1) {
            System.out.println("The queue is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
            que[rear] = data;
            return;
        }
        rear++;
        que[rear] = data;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("The queue is empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
            return;
        }
        front++;
    }

    void print_queue() {
        if (front == -1) {
            System.out.println("The queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(que[i] + " ");
        }
    }

    public static void main(String[] args) {
        queue_array que = new queue_array(5);
        que.enqueue(30);
        que.enqueue(25);
        que.enqueue(5);
        que.enqueue(15);
        que.enqueue(10);

        // que.print_queue();
        que.dequeue();
        que.dequeue();
        // que.dequeue();
        // que.enqueue(7);
        // que.enqueue(20);
        que.dequeue();
        que.print_queue();
    }
}
