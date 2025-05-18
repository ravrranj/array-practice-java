
import java.util.Stack;

public class QueueUsingTwoStacks {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // Enqueue - O(1)
    public void enqueue(int x) {
        s1.push(x);
    }
    
    // Dequeue - Amortized 0(1), worst O(n)
    
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        if(s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
     
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is Empty: " + queue.isEmpty());

       queue.enqueue(40);
       System.out.println("Front: " + queue.peek());
       queue.dequeue();
       System.out.println("Is Empty: " + queue.isEmpty());

    }
}