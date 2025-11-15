package GeeksForGeeks__Java.T8_OOP;

public class Q2_Polymorphism {                  // polymorphism = many forms
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }

    }

    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }

    public static class Lion {
        void speak(){
            System.out.println("Roar");
        }
    }

    public static class Human {
        void speak(){
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Human h = new Human();

        d.speak();                                              // Same function(speak), but different behavior
        c.speak();                                              // depending on where we are using!
        l.speak();
        h.speak();
    }
}
