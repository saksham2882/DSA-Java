package Alpha_16_Stack;
import java.util.ArrayList;

class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    // IsEmpty : O(1)
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Push Operation : O(1)
    public void push(int data) {
        list.add(data);
    }

    // Pop Operation: O(1)
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println("Popped Element is: " + top);
        return top;
    }

    // Peek Operation: O(1)
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        
        return list.get(list.size() - 1);
    }
}

public class CWH_1_Stack_using_ArrayList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        for (int i : s.list) {
            System.out.println("Push -> " + i);
        }

        while (!s.isEmpty()) {
            s.pop();
        }
    }
}