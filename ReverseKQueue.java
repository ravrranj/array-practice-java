
import java.util.*;

public class ReverseKQueue {
    public static void reverseFirstKelements (Queue<Integer> queue, int k, int n) {
        if(queue.isEmpty() || k > queue.size() || k<= 0) {
            return ;
        }

        Stack<Integer> stack = new Stack<>();

        // Push first K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Enqueue elements from stack back to queue
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Move remaining elements to the back
        int remaining = queue.size() - k; 
        for (int i = 0; i < n - k; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of elements in the queue :");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the queue: ");
        for (int i = 0 ; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        reverseFirstKelements(queue, k, n);

        System.out.println("Queue after reversing first K elements: ");
        System.out.println(queue);
        sc.close();
    }
}