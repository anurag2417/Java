package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q6_Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Rows & Columns : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
