package ScalerJavaClasses.Class_10;

import java.util.*;
public class staircase_star_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vale of N : ");
        int N = sc.nextInt();
        for (int i = 1; i<=N; i = i+1) {
            for (int j = 1; j<=i; j = j+1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
