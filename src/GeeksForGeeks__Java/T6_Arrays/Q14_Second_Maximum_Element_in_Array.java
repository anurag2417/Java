package GeeksForGeeks__Java.T6_Arrays;

import java.util.*;

public class Q14_Second_Maximum_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println();

        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1 ; i++) {
            System.out.print("Element " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Elements of the Array : ");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();

        int max = arr[0];
        for (int i = 0; i <= arr.length - 1 ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element in the Array = " + max);

        int secmax = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }

        System.out.println("Second Max element of the Array = " + secmax);
    }
}
