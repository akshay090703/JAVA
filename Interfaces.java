interface H {
    int age = 21;
    String name = "Akshay Kumar Pandey";

    void show();
    void config();
}

// interface J {
interface J extends H {
    void run();
}

// class I implements H, J {
class I implements J {
    public void show() {
        System.out.println("in Class I Show");
    }

    public void config() {
        System.out.println("in Class I Config");
    }
    
    public void run() {
        System.out.println("in Class I Run");
    }
}

public class Interfaces {
    public static void main(String args[]) {
        H obj = new I();
        obj.config();
        obj.show();
        // obj.run();
        
        // as variables in interface are by default static and final
        System.out.println(H.name);
    }   
}
