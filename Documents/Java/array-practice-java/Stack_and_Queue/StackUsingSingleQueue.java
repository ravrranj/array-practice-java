
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

    private Queue<Integer> q = new LinkedList<>();

    // push - 0(n) (Concept (Push Costly Method)

    public void push(int x) {
        q.add(x);
        int size = q.size();
        
        // Rotate the queue to make the last added element come to front
        for (int i = 1; i < size; i++) {
            q.add(q.poll());
        }
    }

    // Pop - O(1)
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return q.poll(); // front of queue is the top of stack
    }

    // Peek - O(1)

    public int peek() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return q.peek();
    }
    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main (String[] args) {
    
        StackUsingSingleQueue stack = new StackUsingSingleQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is Empty ?" + stack.isEmpty());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is Empty ? " + stack.isEmpty());

        stack.push(40);
        System.out.println("Pushed: " + stack.peek());
    }
}