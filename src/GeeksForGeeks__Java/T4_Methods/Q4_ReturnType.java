package GeeksForGeeks__Java.T4_Methods;

public class Q4_ReturnType {

    public static int function1(int A) {                            // yaha pr return type h int.
        System.out.println("I am Function 1.");
        System.out.println("My return type in Integer.");
        if (A>0){
            return 5;                                              // return ka mtlb uss poore function ki value.
        }
        else {
            return 10;
        }
                        // return work as break in functions.
    }

    public static void main(String[] args) {        // isme void ek data type hai aur isi
                                                    // ko return type bolte h.
        int x  =function1(7);
        System.out.println(3 + x);

        //  function1();        // this is stand-alone call of function, isme function ki value print ni hoti h.
    }
}
