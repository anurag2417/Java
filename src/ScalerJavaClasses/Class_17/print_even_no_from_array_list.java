package ScalerJavaClasses.Class_17;

import java.util.*;
public class print_even_no_from_array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(51);
        arr.add(30);
        arr.add(40);
        arr.add(93);
        arr.add(60);
        arr.add(70);
        arr.add(87);
        arr.add(90);
        arr.add(100);

        System.out.println(arr);

        System.out.println();

        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i<arr.size(); i++) {
            if (arr.get(i)%2==0) {
                newArr.add(arr.get(i));
            }

        }
        System.out.println(newArr);








    }
}
