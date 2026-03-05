import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Palindrome Strategy:");
        System.out.println("1. Stack Based");
        System.out.println("2. Deque Based");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.isPalindrome(input);

        System.out.println("Is palindrome ? : "+ result);
    }
}

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    private String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }
    public boolean isPalindrome(String input) {

        String normalized = normalize(input);
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    private String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }
    public boolean isPalindrome(String input) {

        String normalized = normalize(input);
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}