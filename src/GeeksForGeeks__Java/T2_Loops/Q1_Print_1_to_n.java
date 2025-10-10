package GeeksForGeeks__Java.T2_Loops;

import java.util.*;

public class Q1_Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
