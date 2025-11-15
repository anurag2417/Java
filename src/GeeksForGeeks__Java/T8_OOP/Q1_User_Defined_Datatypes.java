package GeeksForGeeks__Java.T8_OOP;

import java.util.*;

public class Q1_User_Defined_Datatypes {

    public static class Student{        // khudka ek datatype bna liya h
                                                    // isko hum blueprint ki tarah consider karenge
        String name;
        int rollNo;
        int age;
        String address;

        void print() {

            System.out.println("Name : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.println("Age : " + age);
            System.out.println("Address : " + address);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();     // ye hamara ek object hai jo ki
                                                        // Student class ki blueprint pr bna h
        s1.name = "Anurag Kumar";
        s1.rollNo = 10513;
        s1.age = 19;
        s1.address = "Ayodhya, Uttar Pradesh";

        Student s2 = new Student();     // ye hamara ek object hai jo ki
                                                        // Student class ki blueprint pr bna hse
        s2.name = "Chandra Madhav";
        s2.rollNo = 10695;
        s2.age = 18;
        s2.address = "Darbhanga, Bihar";

//        System.out.println(s1);      // this will not work in this case
//        System.out.println("Name : " + s1.name);
//        System.out.println("Roll No : " + s1.rollNo);
//        System.out.println("Age : " + s1.age);

        s1.print();
        s2.print();

    }


}

