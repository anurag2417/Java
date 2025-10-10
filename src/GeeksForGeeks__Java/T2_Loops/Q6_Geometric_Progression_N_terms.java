package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q6_Geometric_Progression_N_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term of the GP : ");
        int A = sc.nextInt();

        System.out.print("Enter the Common Ratio of GP : ");
        int R = sc.nextInt();

        System.out.println("Enter Req. No. of Terms in GP : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print(A + " ");
            A = A*R;
        }
    }
}
