package Alpha_09_OOPS;

class Student1 {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

public class CWH_04_Static_Keyword {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.schoolName = "JVM";

        Student1 s2 = new Student1();
        // A static variable is the same for all objects. If one object changes it, the change applies to all.
        System.out.println(s2.schoolName);
   
        Student1 s3 = new Student1();
        s3.schoolName = "ABCDEF";

        // A static object is created only once in memory.
        System.out.println(s2.schoolName);

    }
   
}
