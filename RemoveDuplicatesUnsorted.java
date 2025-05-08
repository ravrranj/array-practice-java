

import java.util.*;

public class RemoveDuplicatesUnsorted {
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> seen = new LinkedHashSet<>(); // to maintain insertion order
        for (int num : nums) {
            seen.add(num);
        } 

    //convert set back to array 
    int[] result = new int[seen.size()];
    int i = 0;
    for (int num : seen) {
        result[i++] = num;
    } 

    return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
              nums[i] = sc.nextInt();
        }

        int[] uniqueArray = removeDuplicates(nums);
        
        System.out.println("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}