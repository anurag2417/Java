package ScalerJavaClasses.Class_8;

import java.util.*;
public class prime_number {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number :");
           int n=sc.nextInt();
           int d=1;
           int c=0;

           while (d<=n){
               if (n%d==0){
                   c++;
               }
               d++;
           }
           if (c==2) {
               System.out.println("Prime Number");
           }

           else {
               System.out.println("Not a Prime Number");
           }
    }
}