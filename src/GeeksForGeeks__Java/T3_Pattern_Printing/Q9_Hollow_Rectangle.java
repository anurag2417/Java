package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q9_Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Rows : ");
        int A = sc.nextInt();

        System.out.print("Enter no of Columns : ");
        int B = sc.nextInt();

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++){
                if (i == 1 || i == A || j == 1|| j == B) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
