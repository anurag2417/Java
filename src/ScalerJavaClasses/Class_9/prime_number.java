package ScalerJavaClasses.Class_9;

import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for (; i<=(n-1); i++) {
            if (n%i==0){
                break;
            }
        }
        if (i<n) {
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("Prime number");
        }

    }
}






