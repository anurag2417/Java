package ScalerJavaClasses.Class_7;

import java.util.*;
public class print_even_number_in_range_of_a_and_b {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long i = a;
        while (i<=b){
            if (i%2==0) {
            System.out.println(i);
            }
            i++;
        }

    }
}
