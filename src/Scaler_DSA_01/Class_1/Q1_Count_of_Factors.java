package Scaler_DSA_01.Class_1;

import java.util.*;

public class Q1_Count_of_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Req. Number: ");
        int N = sc.nextInt();

        int count = 0;

        for (int i = 1; i*i <= N; i++) {
            if (N % i == 0) {
                if (i == N/i){
                    count = count + 1;
                }
                else {
                    count = count + 2;
                }
            }

        }
        System.out.println(count);
    }
}
