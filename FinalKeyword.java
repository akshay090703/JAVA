// final : variable, method, class

final class C {
    final public void show() {
        System.out.println("Show C");
    }

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}

class Laptop{
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


}

public class FinalKeyword {
    public static void main(String args[]) {
        // final int num = 8;
        // // num = 9;
        // System.out.println(num);

        // C obj = new C();
        // obj.show();
        // obj.add(5, 7);

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj);

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj2);
        System.out.println(obj.equals(obj2));
    }
}
