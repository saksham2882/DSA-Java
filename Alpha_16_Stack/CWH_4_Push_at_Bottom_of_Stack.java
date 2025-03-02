package Alpha_16_Stack;
import java.util.Stack;

public class CWH_4_Push_at_Bottom_of_Stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            System.out.println("Pushed at Bottom -> " + data);
            s.push(data);
            return;
        }

        int top = s.pop();
        System.out.println("Popped: " + top);
        pushAtBottom(s, data);
        System.out.println("Pushed -> " + top);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);
        pushAtBottom(s, 4);
        System.out.println(s);
    }
}
