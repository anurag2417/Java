package ScalerJavaClasses.Class_18;

import java.util.*;
public class array_inside_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(50);
        arr2.add(60);
        arr2.add(70);
        arr2.add(80);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(90);
        arr3.add(15);
        arr3.add(25);
        arr3.add(35);

        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(45);
        arr4.add(54);
        arr4.add(65);
        arr4.add(78);

        ArrayList<ArrayList<Integer>> mother_array = new ArrayList<>();
        mother_array.add(arr1);
        mother_array.add(arr2);
        mother_array.add(arr3);
        mother_array.add(arr4);

        System.out.println(mother_array);

        System.out.print("Size of the Mother_Array : ");
        System.out.println(mother_array.size());

        for(int i = 0; i<mother_array.size(); i++) {
            ArrayList<Integer> al = mother_array.get(i);
            for(int j = 0; j<al.size(); j++) {
                if(al.get(j)%2==0) {
                    System.out.print(al.get(j) + " ");
                }
            }
            System.out.println();
        }

    }
}



//    static boolean isUnique(Integer ele, ArrayList<Integer> al ){
//
//        int counter=0;
//        for(int i=0; i<al.size(); i++){
//            if(ele.equals(al.get(i))){
//                counter++;
//            }
//        }
//
//        if(counter==1){
//            return true;
//        }else{
//            return false;
//        }
//    }

