package GeeksForGeeks__Java.T1_If_Else;

import java.util.*;

public class Q4_Profit_or_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Cost Price : ");
        float CP = sc.nextFloat();

        System.out.print("Enter the Selling Price : ");
        float SP = sc.nextFloat();

        float profit = SP - CP;
        float perprofit = (profit*100/CP);

        float loss = CP - SP;
        float perloss = (loss*100/CP);

        if (SP > CP){
            System.out.println("Profit");
            System.out.println("Profit by = " + profit);
            System.out.println("% Profit = " + perprofit + " %");
        }

        else if (CP > SP) {
            System.out.println("Loss");
            System.out.println("Loss by = " + loss);
            System.out.println("% Loss = " + perloss + " %");
        }

        else {
            System.out.println("Neither Profit nor Loss");
        }
    }
}
