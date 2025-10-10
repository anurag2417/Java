package GeeksForGeeks__Java.T3_Pattern_Printing;

import java.util.*;

public class Q8_Flipped_Staiircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of Rows & Columns : ");
        int N = sc.nextInt();

        int A = N;

        for (int i = 1; i <= N; i++){
//            for (int j = 1; j <= N + 1 - i; j++)
            for (int j = 1; j <= A; j++) {
                System.out.print("* ");
            }
            A--;
            System.out.println();

        }



    }
}
