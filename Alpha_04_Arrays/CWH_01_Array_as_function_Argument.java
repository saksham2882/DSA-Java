package Alpha_04_Arrays;

public class CWH_01_Array_as_function_Argument {

    public static void update(int marks[]) {            // Update marks in this function.
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int marks[] = { 97, 98, 99 };                   // Original
        update(marks);


        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");         // Here also updated.
        }
        System.out.println();
    }
}
