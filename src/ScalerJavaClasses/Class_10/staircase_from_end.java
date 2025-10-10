package ScalerJavaClasses.Class_10;

import java.util.*;
public class staircase_from_end {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=N; j++) {
                if (j<=N-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
 }
