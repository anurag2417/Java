package Scaler_DSA_01.Class_2;
import java.util.*;

public class Q1_ {
    public static void main(String[] args){
        System.out.println(solve(1048576));
    }
        public static long solve(int A) {
            int n = A;
            int i = 2;
            ArrayList<Integer> arr= new ArrayList<>();
            while (n!=1){
                if(n%i == 0){
                    arr.add(i);
                    n /= i;
                }
                else
                    i++;
            }


            int num = arr.get(0);
            int ans = 1;
            int a = 1;
            for(int j=1;j<arr.size();j++){
                if(num == arr.get(j)){
                    a++;
                }
                else{
                    ans*=(a+1);
                    a=1;
                    num = arr.get(j);
                }
            }
            ans*=a+1;
            return ans;
        }
    }

