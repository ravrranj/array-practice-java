
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack (O(1))
    public void push (int x) {
    q1.add(x);
    System.out.println("Pushed: " + x );
    }

    // Removes the element on the top of the stack (O(n))
    public int pop() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        // leave the last element in q1, move others to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();  // this is the top of the stack
        
        // swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println("Popped: " + topElement);
        return topElement;
    }

    // get to the top element (O(n))

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();
        q2.add(topElement); // put it back

        //swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println("Peeked: " + topElement);
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

        stack.peek();
        stack.pop();
        stack.pop();

        System.out.println("Is Empty: " + stack.isEmpty());

        stack.pop();
        System.out.println("Is Empty: " + stack.isEmpty());

        stack.push(40);
        stack.peek();
    }
}
