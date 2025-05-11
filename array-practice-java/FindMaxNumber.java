
// find largest and second largest
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the array size
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Taking input for the array elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if ( num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest number is: " + secondMax);
        }

        // find the max number from the list 
        int max = numbers[0]; // assume that the first number is zero
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number is : " + max);
        sc.close();

    }
}