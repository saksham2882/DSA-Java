package Alpha_4_Arrays;

import java.util.Scanner;

public class CWH_2_Linear_Search {

    // Display Array :
    public static void display(int[] num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Linear Search : O(n)
    public static int Linear_Search(int[] num, int element) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        display(num);

        // Linear Searching :
        System.out.println("Enter a Element to Search : ");
        int element = sc.nextInt();

        int a = Linear_Search(num, element);
        if (a > 0) {
            System.out.println("Elemnt Found at Index : " + a);
        } else {
            System.out.println("Element not Found.");
        }

        sc.close();

    }
}
