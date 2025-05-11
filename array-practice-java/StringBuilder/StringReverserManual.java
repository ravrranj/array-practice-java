

import java.util.Scanner;

public class StringReverserManual {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();


        // Loop from end to start 
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the string: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
        sc.close();
    }
    
}