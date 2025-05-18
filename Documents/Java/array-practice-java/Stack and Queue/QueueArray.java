
public class QueueArray {

    int[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    // Constructor
    QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation

    public void enqueu(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = data;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = queue[front];
        front++;
        size--;
        return removed;
    }

    // Peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    
    // IsEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // isFull
    public boolean isFull() {
         return size == capacity; 
    }

    // Main method to test
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueu(10);
        queue.enqueu(20);
        queue.enqueu(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front after dequeue: " + queue.peek());

    }
}