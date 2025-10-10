package ScalerJavaClasses.Java_Problems___Kunal_Kushwaha;

import java.util.*;
public class percentage_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks out of 100");

        System.out.print("Enter the marks in 1st Subject : ");
        float A = sc.nextInt();
        System.out.print("Enter the marks in 2nd Subject : ");
        float B = sc.nextInt();
        System.out.print("Enter the marks in 3rd Subject : ");
        float C = sc.nextInt();
        System.out.print("Enter the marks in 4th Subject : ");
        float D = sc.nextInt();
        System.out.print("Enter the marks in 5th Subject : ");
        float E = sc.nextInt();


        float sum = (A + B + C + D + E);

        float per = sum/5;

        System.out.println(per);
    }
}
