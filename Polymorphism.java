class A {
    public void show() {
        System.out.println("in show A");
    }

    public void config() {
        System.out.println("in config A");
    }
}

// Compile Time Polymorphism
// 1. Method Overloading
// 2. Operator Overloading

class B extends A {
    // Runtime Polymorphism
    // Method overriding
    public void show() {
        System.out.println("in show B");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        A obj = new B();
        obj.show();
        obj.config();
    }    
}
