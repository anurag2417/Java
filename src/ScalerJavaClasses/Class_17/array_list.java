package ScalerJavaClasses.Class_17;

import java.util.*;
public class array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);

        System.out.println(arr);

        System.out.println();

        System.out.println("Size of the ArrayList : " + arr.size());

        System.out.println();

        for (int i = 0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println();







    }
}
