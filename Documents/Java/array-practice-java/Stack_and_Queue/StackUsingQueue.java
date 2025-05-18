
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // push is O(1)
    public void push(int x) {
        q1.add(x);
    }

    // pop() and peek() are O(n) ❗(because of queue rotation)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topElement = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();
        q2.add(topElement);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }

    public boolean isEmpty() {
    return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());

        stack.push(40);
        System.out.println("Peek: " + stack.peek());
    }
}
