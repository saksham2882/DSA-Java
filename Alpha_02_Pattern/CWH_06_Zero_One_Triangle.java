package Alpha_02_Pattern;

import java.util.Scanner;

public class CWH_06_Zero_One_Triangle {
    
    public static void ZeroOneTri(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows: ");
        int row = sc.nextInt();

        ZeroOneTri(row);

        sc.close();
    }
}
