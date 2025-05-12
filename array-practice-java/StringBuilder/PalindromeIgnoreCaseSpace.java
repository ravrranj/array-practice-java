

import java.util.Scanner;

public class PalindromeIgnoreCaseSpace {
    public static boolean isPalindrome(String str) {
        // we are checking the palindrome manually

        //remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string (include spaces) : ");

            String str = sc.nextLine();

            System.out.println("Is palindrome: " + isPalindrome(str));
            sc.close();

        }
    
}