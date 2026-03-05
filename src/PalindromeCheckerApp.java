import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length -1;
        boolean palindrome = true;

        while (start < end) {
            if(chars[start] == chars[end]) {
                palindrome = true;
            } else {
                palindrome = false;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome ? : " + palindrome );
    }
}