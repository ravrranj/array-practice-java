

import java.util.LinkedList;
import java.util.Queue;

public class TimeCounter {
    private Queue<Integer> queue;

    // constructor
    public TimeCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);

        //Remove older timestamp older than t - 3000

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main (String[] args) {

        TimeCounter counter = new TimeCounter();

        // Test cases

        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3000));
        System.out.println(counter.ping(3060));
        System.out.println(counter.ping(6000));
    }
}