package ScalerJavaClasses.Class_11;

import java.util.*;
public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int nf = 1;
        for (int i = 1; i<=N; i++) {
            nf = nf * i;
        }
        int nr = 1;
        for (int j = 1; j<=R; j++) {
            nr = nr*j;
        }
        int M = (N-R);
        int nrf = 1;
        for (int k = 1; k<=M; k++) {
            nrf = nrf*k;
        }
        int ans = nf/(nr*nrf);
        System.out.println(ans);
    }
}

