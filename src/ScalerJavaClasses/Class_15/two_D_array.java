package ScalerJavaClasses.Class_15;

import java.util.*;
class two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] mat = new int[N][M];

        int num = 10; // Start from 1

        // Fill the array with natural numbers
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}