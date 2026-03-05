import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeChecker(input);
    }

    static void PalindromeChecker(String str) {
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println(str + " is Palindrome.");
        } else {
            System.out.println(str + " is not Palindrome.");
        }
    }
}
