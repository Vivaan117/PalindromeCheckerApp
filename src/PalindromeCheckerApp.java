import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean palindrome = true;

        for(char c : input.toCharArray()) {
            if(c != stack.pop()) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome ? : " + palindrome );
    }
}