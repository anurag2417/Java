package ScalerJavaClasses.Class_10;

import java.util.*;
public class rectangle_stars {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of Columns : ");
    int N = sc.nextInt();
    System.out.println("Enter the no. of Rows : ");
    int M = sc.nextInt();
    for (int i=1; i<=M; i=i+1) {
        for (int j=1; j<=N; j=j+1) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
