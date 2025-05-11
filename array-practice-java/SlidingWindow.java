import java.util.Scanner;


/**
 * This program demonstrates the Sliding Window technique.
 * It calculates the maximum sum of any subarray of size k in a given array.
 * Instead of recomputing the sum for each subarray from scratch (O(n*k)),
 * it optimizes the process to O(n) by adjusting the sum incrementally.
 */

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array and window size

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the window size (k): ");
        int k = sc.nextInt();

        //Edge case

        if ( n < k) {
            System.out.println("Window size must be less than or equal to array size.");
            return;
        }

        // Sliding windows logic 
        int windowSum = 0;
        int maxSum = 0;

        // Calculate the sum of the first window(first K elements )

        for (int i = 0; i < k ; i++) {
            windowSum += arr[i];
        }

        // Initialize maxSum with the sum of the first window
        maxSum = windowSum;

        //Slide the window , update the sum by adding the new elements and removing the old one

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];  // Add the new element, remove the old one
            maxSum = Math.max(maxSum, windowSum); // keep track of the maximum sum
        }

        System.out.println("The maximum sum of a subarray of size " + k + "is: " + maxSum );
        
        sc.close();
    }
}