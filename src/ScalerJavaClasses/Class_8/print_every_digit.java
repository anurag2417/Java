package ScalerJavaClasses.Class_8;

import java.util.*;
public class print_every_digit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        while (n>0) {


            System.out.println(n%10);
            n = (n/10);

        }

    }
}
