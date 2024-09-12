abstract class F{
    int age;

    public abstract void show();
    // public void show() {
    //     System.out.println("In F show");
    // }

    // static class G {
    //     public void config() {
    //         System.out.println("in config");
    //     }
    // }
}

public class InnerClass {
    public static void main(String args[]) {
        F obj1 = new F() {
            // Anonymous Inner Class
            public void show() {
                System.out.println("In show of InnerClass");
            }
        };
        obj1.show();

        // when inner class is non static
        // F.G obj2 = obj1.new G();

        // when inner class is static
        // F.G obj2 = new F.G();
        // obj2.config();
    }
}
