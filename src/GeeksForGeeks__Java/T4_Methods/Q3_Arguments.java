package GeeksForGeeks__Java.T4_Methods;

public class Q3_Arguments {

    public static void sum(int a, int b, int c) {          // here, int a and int b, int c
        System.out.println(a+b+c);                         // are called parameters.
    }

    public static void main(String[] args) {
        System.out.print("Sum : ");
        sum(8,15, -5);              // yaha pr 8, 15, -5 arguments hai.
    }
}
