package GeeksForGeeks__Java.T7_ArrayList;

import java.util.*;

public class Q2_Reverse_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);


        System.out.println();

        System.out.println(arr);

        int i = 0;
        int j = arr.size() - 1;

        while (i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        //Collections.reverse(arr);

        System.out.println(arr);
    }
}
