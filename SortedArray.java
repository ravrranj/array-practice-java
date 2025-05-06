

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static boolean isSorted (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) { 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number of elements: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

     System.out.println("Enter " + n + " elements:  ");
     for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); 
     }
     
     System.out.println("Is array sorted? " + isSorted(arr) );
     sc.close();

    }
}

