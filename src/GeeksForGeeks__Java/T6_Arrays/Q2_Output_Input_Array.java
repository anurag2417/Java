package GeeksForGeeks__Java.T6_Arrays;

import java.util.Scanner;

public class Q2_Output_Input_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, -8, 2, 67, 43, -97};                // Manual Input
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();


        System.out.print("Enter the Size of Array : ");     // input using for loop
        int N = sc.nextInt();

        int[] arr1 = new int[N];

        for (int i = 0; i <= arr1.length - 1 ; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Req. Array : ");                  // output of array using for loop
        for (int i = 0; i <= arr1.length - 1; i++){
            System.out.print(arr1[i] + "  ");
        }


        System.out.println();
        System.out.println();
        System.out.print("Req. Array after doubling the each element : ");
        for (int i = 0; i <= arr1.length - 1; i++){
            System.out.print(2*arr1[i] + "  ");
        }
    }
}
