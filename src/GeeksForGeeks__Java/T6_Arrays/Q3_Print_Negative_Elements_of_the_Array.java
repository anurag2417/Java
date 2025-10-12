package GeeksForGeeks__Java.T6_Arrays;

import java.util.*;

public class Q3_Print_Negative_Elements_of_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array :  ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i <= N - 1 ; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();

        }

        System.out.println();
        System.out.println();

        System.out.print("Req. Array : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();

        System.out.print("Negative Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + "  ");
            }
        }


    }
}
