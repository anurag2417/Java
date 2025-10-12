package GeeksForGeeks__Java.T6_Arrays;

import java.util.*;

public class Q12_Search_in_Array {
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

        System.out.print("Enter the Element to be Searched : ");
        int T = sc.nextInt();

        boolean found = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == T) {
                found = true;
                break;
            }
        }

        System.out.println();

        if (found) {
            System.out.println(T + " exist in the Array.");
        }
        else {
            System.out.println(T + " does not exist in the Array.");
        }

    }
}
