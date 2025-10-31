package Scaler_DSA_01.Class_3;
import java.util.*;

//public class Q1_ {
//
//}
public class Student {

    String name;
    String email;
    int age;
    double cgr;

    void dispalyName() {
        System.out.println(name);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.name = "Anurag";
        s.email = "anuragakn18@gmail.com";
        s.age = 19;
        s.cgr = 7.25;

        s.dispalyName();
        System.out.println(s.email);
    }
}

