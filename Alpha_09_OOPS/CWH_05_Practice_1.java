package Alpha_09_OOPS;

class Student2 {
    String name;
    int marks;
}

public class CWH_05_Practice_1 {
    public static void main(String[] args) {

        Student2 s1 = new Student2();

        // Problem 1 :
        s1.name = "abc";                   // In java we only access property using "DOT OPERATOR".
        System.out.println(s1.name);
        // Student2.name = "abc";          // Only if we make "name static".     
        
    }
}
