import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto the stack O(n)
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop - O(1)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return q1.poll();
    }

    // Peek - O(1)
    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());       // 30
        System.out.println("Popped: " + stack.pop());     // 30
        System.out.println("Top after pop: " + stack.peek()); // 20
        System.out.println("Popped: " + stack.pop());     // 20
        System.out.println("Is Empty? " + stack.isEmpty()); // false
        System.out.println("Popped: " + stack.pop());     // 10
        System.out.println("Is Empty? " + stack.isEmpty()); // true

        stack.push(40);
        System.out.println("Pushed : " + stack.peek());   

    }
}
