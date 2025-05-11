

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPlaindrome(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        if(isPlaindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome. ");
        }
    }
}