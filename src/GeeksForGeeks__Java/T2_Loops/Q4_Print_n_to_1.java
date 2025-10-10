package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q4_Print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
