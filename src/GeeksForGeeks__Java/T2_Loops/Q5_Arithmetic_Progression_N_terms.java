package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q5_Arithmetic_Progression_N_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First term of AP : ");
        int A = sc.nextInt();

        System.out.print("Enter the Common Difference of AP : ");
        int D = sc.nextInt();

        System.out.print("Enter Req. No. of Terms in AP : ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.print(A + " ");
            A = A + D;
        }

    }
}
