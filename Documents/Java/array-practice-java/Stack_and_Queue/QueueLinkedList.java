

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    private Node front, rear;

    public QueuLinkedList(){
        front = rear = null;
    }

    public void enqueu(int data) {
        Node newNode = new Node(data);
        if(rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        return value;
    }
    
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueuLinkedList q = new QueuLinkedList();
        q.enqueu(10);
        q.enqueu(20);
        q.enqueu(30);

        System.out.println("Peek: " + q.peek()); 
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
    }
}