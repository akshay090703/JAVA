class D {
    public void show1 () {
        System.out.println("in D Show");
    }
}

class E extends D {
    public void show2 () {
        System.out.println("in E Show");
    }
}

public class UpDownCasting {
    public static void main(String args[]) {
        // Up casting
        // D obj1 = new E();
        D obj1 = (D) new E();
        obj1.show1();

        E obj2 = (E) obj1;
        obj2.show2();
    }
}
