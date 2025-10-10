package ScalerJavaClasses.Class_11;

import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long prod = 1;
        for (long i = 1; i<=N; i++) {
            prod=prod*i;
        }
        System.out.println(prod);
    }
}
