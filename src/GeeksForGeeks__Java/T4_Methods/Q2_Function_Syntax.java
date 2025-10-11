package GeeksForGeeks__Java.T4_Methods;

public class Q2_Function_Syntax {

    public static void function1() {
        System.out.println("I am a new function.");
    }

    public static void main(String[] args) {                // ye wala main function hota hai aur yahi
        System.out.println("Hello World!");                 // sabse pehle run krta hai poore code mein.
                                                            // complete code me fucntion ka order matter ni krta.

        function1();     // this is called function call.                                // Remember
                        // main function ke alawa jitne function code me hai,           // main function ko kabhi
                        // woh tabhi run karenge jb unko call kiya jayega.              // call ni kr skte.


                                            // ek function doosre function ko call kr skta hai.

    }
}
