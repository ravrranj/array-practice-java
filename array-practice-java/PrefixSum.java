import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int [] arr = new int[n];


        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Enter the range (l and r): ");
        int l = sc.nextInt();  
        int r = sc.nextInt();

        int sum; 
        if(l == 0) {
           sum = prefix[r];
        } else {
            sum = prefix[r] - prefix[l - 1];
        }

        System.out.println("Sum from index " + l + " to " + r + " is: " + sum);
        sc.close();
    }
}