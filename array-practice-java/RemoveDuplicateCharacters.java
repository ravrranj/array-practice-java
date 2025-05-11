

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String noDuplicates = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + noDuplicates);

        sc.close();
    }
}