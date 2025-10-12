package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q7_Min_element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int N = sc.nextInt();

        System.out.println();

        int[] arr = new int[N];

        System.out.println("Enter the Elements of the array : ");
        for (int i = 0; i <= arr.length - 1; i++) {
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

        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Mix Element in Array = " + min);
    }
}
