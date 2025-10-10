package ScalerJavaClasses.Class_12;

import java.util.*;
public class alphabet_staricase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vale of N : ");
        int N = sc.nextInt();
        for (int i = 1; i<=N; i = i+1) {
            for (int j = 1; j<=i; j = j+1) {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}

