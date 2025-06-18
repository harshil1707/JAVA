import java.util.*;
public class Main {
    public static boolean PalindromeChecker(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return PalindromeChecker(str, left + 1, right-1);
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Your Word Here: ");
        String word = src.nextLine();
        boolean isPalindrome = PalindromeChecker(word, 0, word.length()-1);
        if (isPalindrome) {
            System.out.println("Your Word is Palindrome");
        }
        else {
            System.out.println("Your Word is not Palindrome");
        }
    }
}