package GeeksForGeeks__Java.T8_OOP;

public class Q4_Constructors {
    public static class Car {
        int seats;    // 0
        String name;    // null
        double length;  // 0.0
        Car(){      // default constructor

        }

        Car(int x, String s, double d){         // parametrised constructor
            seats = x;
            name = s;
            length = d;
        }

        void print() {
            System.out.println("Seats = " + seats);
            System.out.println("Name = " + name);
            System.out.println("Length = " + length);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5, "Range Rover", 4.58);              // c1 and c2 parametrised constructor se bane hai
        c1.print();

        Car c2 = new Car(4, "Lord Alto", 3.78);
        c2.print();

        Car c3 = new Car();                                                     // c3 default constructor se bna hai
        c3.name = "Defender";
    }
}
