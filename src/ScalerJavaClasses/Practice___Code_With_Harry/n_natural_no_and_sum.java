package ScalerJavaClasses.Practice___Code_With_Harry;

import java.util.*;
public class n_natural_no_and_sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.println(i);
            i++;
        }
        int sum = (n*n+n)/2;
        System.out.println(sum);
    }
}
