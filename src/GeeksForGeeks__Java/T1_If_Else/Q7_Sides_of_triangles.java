package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q7_Sides_of_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Side : ");
        int A = sc.nextInt();

        System.out.print("Enter the Second Side : ");
        int B = sc.nextInt();

        System.out.print("Enter the Third Side : ");
        int C = sc.nextInt();

        if (((A + B) > C) && ((B + C) > A) && ((C + A) > B)) {
            System.out.println(A + ", " + B + ", " + C + " are the sides of a Triangle");
        }

        else {
            System.out.println(A + ", " + B + ", " + C + " are not the sides of a Triangle");
        }
    }
}
