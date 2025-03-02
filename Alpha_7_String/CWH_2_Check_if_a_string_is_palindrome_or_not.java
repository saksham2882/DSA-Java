package Alpha_7_String;

public class CWH_2_Check_if_a_string_is_palindrome_or_not {

    // T.C : O(n)
    public static void isPalindrome(String s) {
        boolean isPalin = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i -1)) {
                isPalin = false;
                break;
            }
        }
        
        if (isPalin) {
            System.out.println(s + " is Palindrome.");
        }
        else {
            System.out.println(s + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {

        isPalindrome("racecar");
        isPalindrome("mimimboibmimim");
    }
} 