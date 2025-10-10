package ScalerJavaClasses.Practice___Code_With_Harry;

import java.util.*;
public class print_even_no_in_reverse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
