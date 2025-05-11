

import java.util.Scanner;

public class RemoveDuplicates1 {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // assuming ASCII characters

        for (char ch : input.toCharArray()) {
            if (!seen[ch]) {  //  if character hasn't been seen
            result.append(ch);
            seen[ch] = true; // mark as seen 
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        System.out.println(removeDuplicates(input)); // output
        sc.close();
    }
}