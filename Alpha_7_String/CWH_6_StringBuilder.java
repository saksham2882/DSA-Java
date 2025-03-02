package Alpha_7_String;

public class CWH_6_StringBuilder {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(); // here its type is not a string but we convert it into string using "sb.toString()". This function convert any Object into String.
        
        // Example : int a = 10;  a.toString()  --> not possible (error) but Integer a = 10; a.toString();  ----> output => "10"

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        // Output : abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.length());
    }
}
