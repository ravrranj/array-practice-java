
import java.util.Stack;

public class QueueUsingOneStackRecursive {
    private Stack<Integer> stack = new Stack<>();

    // Enqueue is simple push
    public void enqueue(int x) {
        stack.push(x);
    }

    // Dequeue using recursion
    public int dequeue() {
        if(stack.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int x = stack.pop();

        // Base case: if it's the last element 
        if (stack.isEmpty()) {
            return x;
        }

        int result = dequeue();  // recursive call
        stack.push(x);          // restore the stack 
        return result;
    }

    // Peek using recursion
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int x = stack.pop();

        // Base case: if it's the last element
        if(stack.isEmpty()) {
            stack.push(x);  //push it back before returning
            return x;
        }

        int result = peek(); // Recursive call
        stack.push(x);       // Restore the stack
        return result;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    // testing

    public static void main(String[] args) {
    QueueUsingOneStackRecursive queue = new QueueUsingOneStackRecursive();

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    queue.dequeue();
    queue.dequeue();
    queue.peek();
    System.out.println("Is Empty: " +queue.isEmpty());
    queue.dequeue();
    queue.peek();
    queue.isEmpty();

    queue.enqueue(40);
    System.out.println("Peek : " + queue.peek());
    }

}