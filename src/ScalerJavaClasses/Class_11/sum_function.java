package ScalerJavaClasses.Class_11;

import java.util.*;
public class sum_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long answer = sum (a, b, c);
        System.out.println(answer);
    }
    static long sum (long a, long b, long c) {
        return a+b+c;
    }
}
