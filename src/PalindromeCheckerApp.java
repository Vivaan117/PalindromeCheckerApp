import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean palindrome = checker.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + palindrome);
    }
}
class PalindromeChecker {

    // Exposed method
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize (remove special characters and make lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}