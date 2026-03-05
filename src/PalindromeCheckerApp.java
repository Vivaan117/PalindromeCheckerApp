import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean palindrome = true;
        for(int i = 0; i < normalized.length() /2; i++) {
            if(normalized.charAt(i) != normalized.charAt(normalized.length()-1-i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + palindrome);
    }
}