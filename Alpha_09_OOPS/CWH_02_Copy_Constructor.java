package Alpha_09_OOPS;

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called......");
    }

    // Copy Constructor : It copy all the property of the s1 object (s1 constructor).

    // 1. Shallow Copy constructor :
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.password = s1.password;
    //     this.marks = s1.marks;
    // }

    // 2. Deep Copy Constructor :
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

public class CWH_02_Copy_Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Saksham";
        s1.roll = 143;
        s1.password = "abcd";
        System.out.println(s1.name);
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 90;

        // copy
        Student s2 = new Student(s1);
        s2.password = "xyzAbcd";
        System.out.println(s2.name);
        System.out.println(s2.password);

        s1.marks[2] = 92; 
        // When copying s1 to s2, only the reference is copied, not the actual values. So, any change in s1 also reflects in s2.
        // It create a problem the if we change something in s1 so s2 is also changed. To solve this we use "Shallow and deep copy."

        // The Above Problem come when we create a "SHALLOW COPY".
        // Now comment out the shallow constructor and run the "DEEP COPY" constructor and you see the difference. 

        // NOTE :
        // 1. Changes Don't reflect in Deep Copy.
        // 2. Changes Reflect in Shallow Copy.

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}
 