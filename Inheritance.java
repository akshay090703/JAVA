import calc.SciCalc;

// // Super class Or Parent Class
// class A extends Object { // by default extends to Object
//     public A() {
//         super();
//         System.out.println("in A");
//     }

//     public A(int n) {
//         super();
//         System.out.println("in A int");
//     }
// }

// // Derived Class
// class B extends A {
//     public B() {
//         super();
//         System.out.println("in B");
//     }

//     public B(int n) {
//         // super(n);
//         this();
//         System.out.println("in B int");
//     }
// }

public class Inheritance{
    public static void main(String args[]) {
        // B obj = new B(20);
        SciCalc obj = new SciCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.mul(4, 7);
        int r4 = obj.div(25, 5);
        int r5 = obj.power(4, 4);

        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4);
        System.out.println(r5);
    }
}