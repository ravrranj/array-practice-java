import java.util.Scanner;

public class StringReverser {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();  // Built-in method to reverse the string
        return sb.toString();
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
