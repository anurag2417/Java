package GeeksForGeeks__Java.T7_OOP;

class Student{
    String name;
    private int rollNo;
    double cgpa;
}

public class Q3_Private_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.rollNo);          // hum private cheezo ko print ya fhir modify ni kr skte
                                                                   // ek baar  jo value assign ho gya wahi rehega hamesha
    }
}
