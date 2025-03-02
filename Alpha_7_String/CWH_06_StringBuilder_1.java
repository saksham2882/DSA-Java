package Alpha_7_String;
public class CWH_06_StringBuilder_1 {
    public static void main(String[] args) {
        
        // Difference between string and string builder:
        // 1. String is immutable and string builder is mutable.
        // 2. String is thread safe and string builder is not thread safe.
        // 3. String is slow and string builder is fast.

        // Why string builder needed in our program instead of string:
        // 1. When we need to perform many operations on string then we need to use StringBuilder.
        // The main reason is that when we perform some operation on string so new string created and memory pointer points the new string and this process is time taking in some large code so it is slow.
        // while the StringBuilder does not create a new string and points that. It update the same string so time reduces.

        // Most of the method are similar to String in String builder.

        StringBuilder sb = new StringBuilder("Rohit");
        System.out.println(sb);

        // Char at index:
        System.out.println(sb.charAt(0));

        // set char at index:
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // inserrt char at any index
        sb.insert(0, 'B');
        sb.insert(3, 'G');
        System.out.println(sb);  

        // delete char at any index from any index:
        sb.delete(0, 1);      // from 0 to 0
        sb.delete(2, 3);
        // sb.delete(0, 3);
        System.out.println(sb);

        // append (no new string create only add in the original string so fast process)
        sb.append(" is a good boy");
        sb.append(" And Human being.");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
