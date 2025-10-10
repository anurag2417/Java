package ScalerJavaClasses.Practice___Code_With_Harry;

import java.util.*;
public class sum_and_product {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int A = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int B = sc.nextInt();
        int sum = A+B;
        int product = A*B;
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+product);
    }
}
