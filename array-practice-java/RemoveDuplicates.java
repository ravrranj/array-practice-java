

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;  //to track unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex])  {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];  //move non-duplicates elements forward

            }
        }

        return uniqueIndex + 1; // Return the count of unique elements 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];  // declaring the array name

        System.out.println("Enter " + n + " sorted elements : ");
        for (int i = 0; i < n; i++){
         nums[i] = sc.nextInt();  //Input the elements before processing 
        }

        int length = removeDuplicates(nums); // call the function with the input array

        System.out.println("Modified array with duplicates removed: ");
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i] + " ");
        }
        sc.close();
    }
}