package Alpha_16_Stack;
import java.util.Stack;

public class CWH_9_Valid_Parenthese {

    public static boolean isValid(String str) {          // O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {   // Opening
                s.push(ch);
            } 
            else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        String str = "(({[]()}[]))";
        String str_1 = "(({[)[[";
        String str_2 = "]]]]]]]]]";


        System.out.println(isValid(str));
        System.out.println(isValid(str_1));
        System.out.println(isValid(str_2));
    }
}
