package ScalerJavaClasses.Class_9;

import java.util.*;
public class gcd_of_two_no {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int min = 1;
    if (A>B) {
        min = A;
    }
    else {
        min = B;
    }
    while (min>=1){
        if (A%min==0 && B%min==0) {
            break;
        }
        min--;
    }
    System.out.print(min);
    }
}
