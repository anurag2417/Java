package Scaler_DSA_01.Class_3;

public class Triangle {
    double height;
    double base;

    double area(){
        return 0.5*height*base;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.height = 5;
        t.base = 8;

        System.out.println(t.area());
    }
}
