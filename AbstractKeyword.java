abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

abstract class WagonR extends Car{
    public void drive() {
        System.out.println("Driving WagonR...");
    }
}

class UpdatedWagonR extends WagonR{
    public void fly() {
        System.out.println("Flying WagonR...");
    }
}

public class AbstractKeyword {
    public static void main(String args[]) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
