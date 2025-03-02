package Alpha_2_Pattern;

import java.util.Scanner;

public class CWH_8_Solid_Rhombus {

    public static void Solid_Rhombus(int row) {
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows : ");
        int row = sc.nextInt();

        Solid_Rhombus(row);

        sc.close();
    }
}
