@FunctionalInterface
interface A {
    // void show(int i);
    int sum(int i, int j);
    // void methodB(); will give an error as no longer a SAM
}

public class Annotations {
    public static void main(String args[]) {
        // Lambda Functions
        // A obj = i -> System.out.println("In show! " + i);

        A obj = (i, j) -> i + j;

        int result = obj.sum(5, 4);
        System.out.println(result); 
    }
}
