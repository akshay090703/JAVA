class Human {
    private int age;
    private String name;

    public Human() {
        this.age = 0;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
} 

public class Encapsulation {
    public static void main(String args[]) {
        Human obj = new Human(25, "John");
        // obj.age = 25;
        // obj.name = "John";

        // System.out.println(obj.name);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}