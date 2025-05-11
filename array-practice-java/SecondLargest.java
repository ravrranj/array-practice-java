

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return Integer.MIN_VALUE;   // return -1 or any invalid value 
        }

        //Sort the array in ascending order
        Arrays.sort(arr);

        //Find the second largest element (handling duplicates)
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < largest) {
                return arr[i];  // second largest
            }
        }
        return Integer.MIN_VALUE;  // no valid single largest number found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int SecondLargest = findSecondLargest(arr);
        if(SecondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is : " + SecondLargest);
        } else {
            System.out.println("No valid second largest number found.");
        }
        sc.close();
    }
}