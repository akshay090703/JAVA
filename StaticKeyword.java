class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("In Constructor");
    }

    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void show1(Mobile obj) {
        System.out.println("In Static Method");
        System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Name: " + name);
    }
}

public class StaticKeyword {
    public static void main(String args[]) {
        // Static keyword is used with classes, methods and variables.
        Mobile mob1 = new Mobile("Apple", 200);
        Mobile mob2 = new Mobile("Samsung", 300);

        mob1.show();
        mob2.show();

        Mobile.show1(mob1);
    }
}