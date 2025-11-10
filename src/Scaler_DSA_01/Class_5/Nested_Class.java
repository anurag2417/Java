package Scaler_DSA_01.Class_5;

public class Nested_Class {
    public static class Pair {
        int x;
        int y;

        Pair(int xval, int yval) {
            x = xval;
            y = yval;
        }
    }
    public static void main(String[] args) {
        Pair p = new Pair(10, 8);
        System.out.println("Pair is : " + p.x + ", " + p.y);
    }
}
