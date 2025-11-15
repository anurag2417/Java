package GeeksForGeeks__Java.T8_OOP;

class Cricketer{
    final String country = "India";
    int runs;
    String name;
    double avg;
}

public class Q6_Final_and_Static {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        // c1.country = "England";
        System.out.println(c1.country);
        c1.runs=56;
        System.out.println(c1.runs);
    }
}
