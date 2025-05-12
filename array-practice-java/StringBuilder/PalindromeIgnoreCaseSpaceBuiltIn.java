

import java.util.Scanner;

public class PalindromeIgnoreCaseSpaceBuiltIn {

    // checking palindrome using built in function

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Is palindrome: " + isPalindrome(str));
        sc.close();
    }
}