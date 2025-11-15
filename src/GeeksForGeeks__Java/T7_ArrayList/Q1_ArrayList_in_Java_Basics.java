package GeeksForGeeks__Java.T7_ArrayList;

import java.util.*;

public class Q1_ArrayList_in_Java_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(21);
        arr.add(23);
        arr.add(56);
        arr.add(98);

        // System.out.println(arr[2]);          This will not work here.

        System.out.println(arr.get(2));

        // arr[2] = 56;                         This will not work.
        // arr.get(2) = 56;                     This will not work.

        arr.set(2, 56);         // same as arr[2] = 56
        System.out.println(arr.get(2));

        System.out.println(arr);                // This will work in ArrayList.
                                                // but not traversing the array by ourselves.

        System.out.println();
        int n = arr.size();     // arr.length
        for(int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
