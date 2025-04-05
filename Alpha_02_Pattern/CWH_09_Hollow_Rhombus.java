package Alpha_02_Pattern;

import java.util.Scanner;

public class CWH_09_Hollow_Rhombus {

    public static void Hollow_Rhombus(int row) {
        
        for (int i = 1; i <= row; i++) {

            // starting Space :
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
 

            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        Hollow_Rhombus(row);

        sc.close();
    }
}
