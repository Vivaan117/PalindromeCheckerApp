import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean palindrome = true;

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome ? : " + palindrome );
    }
}