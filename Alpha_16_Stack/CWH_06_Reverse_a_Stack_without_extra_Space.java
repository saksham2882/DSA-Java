package Alpha_16_Stack;
import java.util.Stack;

public class CWH_06_Reverse_a_Stack_without_extra_Space {
    
    // pushAtBottom: O(n)
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Reverse Stack without using Extra Space:   T.C = O(n)
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;   // Empty Stack is already reversed
        }

        int top = s.pop();
        System.out.println("Popped: " + top);
        reverseStack(s);
        System.out.println("Pushed at Bottom: " + top);
        pushAtBottom(s, top);
    }
    
    // PrintStack :
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
        printStack(s);
    }
}
