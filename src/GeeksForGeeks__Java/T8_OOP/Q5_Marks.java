package GeeksForGeeks__Java.T8_OOP;

public class Q5_Marks {
    public static class Student_Data{
        String name;
        int rollNo;
        int[] marks;

        Student_Data(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        Student_Data s1 = new Student_Data(5);
        Student_Data s2 = new Student_Data(3);
    }
}
