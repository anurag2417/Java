package ScalerJavaClasses.Class_18;

import java.util.ArrayList;
public class unique_entries {
    public static void main(String[] args) {

        ArrayList<Integer> shreya = new ArrayList<>();
        shreya.add(1);
        shreya.add(2);
        shreya.add(2);
        shreya.add(4);

        ArrayList<Integer> sanskriti = new ArrayList<>();
        sanskriti.add(-1);
        sanskriti.add(8);
        sanskriti.add(8);

        ArrayList<Integer> lakshmi = new ArrayList<>();
        lakshmi.add(5);
        lakshmi.add(6);
        lakshmi.add(8);
        lakshmi.add(8);


        ArrayList<Integer> dharani = new ArrayList<>();
        dharani.add(6);
        dharani.add(6);
        dharani.add(74);
        dharani.add(84);


        ArrayList<ArrayList<Integer>> mother_al = new ArrayList<>();
        mother_al.add(shreya);
        mother_al.add(sanskriti);
        mother_al.add(lakshmi);
        mother_al.add(dharani);


        ArrayList<ArrayList<Integer>> ans = new
                ArrayList<>();


        for(int i=0; i<mother_al.size(); i++){

            ArrayList<Integer> newal = new
                    ArrayList<Integer>();

            ArrayList<Integer> al = mother_al.get(i);

            for(int j=0; j<al.size(); j++){
                if(isUnique(al.get(j), al) == true){
                    newal.add(al.get(j));
                }
            }
            ans.add(newal);
        }



        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }


    }


    static boolean isUnique(Integer ele, ArrayList<Integer> al ){

        int counter=0;
        for(int i=0; i<al.size(); i++){
            if(ele.equals(al.get(i))){
                counter++;
            }
        }

        if(counter==1){
            return true;
        }else{
            return false;
        }
    }
}