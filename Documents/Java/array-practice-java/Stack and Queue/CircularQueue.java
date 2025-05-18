
public class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;

    }
   public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return ;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println("Enqueued: " + data);
   }

   public boolean isEmpty() {
    return size == 0;
   }

   public int dequeue() {
    if(size == 0) {
        System.out.println("Queue is empty.Cannot dequeue. ");
        return -1;
    }

    int removed = arr[front];

    if(front == rear) {
        // only one element was present 
        front = -1;
        rear = -1;
    } else {
        front = (front + 1)% capacity;
    }
    size--;
    System.out.println("Dequeued: " + removed);
    return removed;
   }

   public int peek() {
    if(isEmpty()) {
        System.out.println("Queue is empty.Cannot peek.");
        return -1;
    }
    return arr[front];
}

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
   
    System.out.print("Queue elements: ");
    int count = 0;
    int i = front;
    while(count < size) {
        System.out.print(arr[i] + " ");
        i = (i + 1) % capacity;
        count++;
    }
    System.out.println();
   }

   public class main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Enqueue some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // add 60 next in the original queue

        queue.enqueue(60);

        // dequeue / remove elements

        queue.dequeue();
        queue.dequeue();

        // adding elements again to see circular characterstics

        queue.enqueue(60);
        queue.enqueue(70);

        // Try to enqueue into full queue again
        queue.enqueue(80);

        System.out.println("Front element is : " + queue.peek());
    }
   }
}