package ScalerJavaClasses.Class_17;

import java.util.*;
public class reverse_array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        arr.addFirst(10);
        arr.addFirst(20);
        arr.addFirst(30);
        arr.addFirst(40);
        arr.addFirst(50);
        arr.addFirst(60);
        arr.addFirst(70);
        arr.addFirst(80);
        arr.addFirst(90);
        arr.addFirst(100);

        System.out.println(arr);

        System.out.println();

        System.out.println("Size of the ArrayList : " + arr.size());

        System.out.println();

        for (int i = 0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}