package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q1_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Rows : ");
        int A = sc.nextInt();

        System.out.print("Enter no of Columns : ");
        int B = sc.nextInt();

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
