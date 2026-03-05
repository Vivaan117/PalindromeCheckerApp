import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean palindrome = true;

        while(list.size() > 1) {
            if(!list.removeFirst().equals(list.removeLast())) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome ? : " + palindrome );
    }
}