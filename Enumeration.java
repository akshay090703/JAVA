// enum Status {
//     Running, Failed, Pending, Success;
// }

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumeration {
    public static void main(String args[]) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        Laptop[] allLap = Laptop.values();
        for(Laptop laptop : allLap) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }

        // Status s = Status.Success;
        // // System.out.println(s);

        // if(s == Status.Running)
        //     System.out.println("All Good");
        // else if(s == Status.Failed)
        //     System.out.println("Try Again");
        // else if(s == Status.Pending) 
        //     System.out.println("Please Wait");
        // else
        //     System.out.println("Done!");

        // switch(s) {
        //     case Running:
        //         System.out.println("All Good");
        //         break;
        //     case Failed:
        //         System.out.println("Try Again");
        //         break;
        //     case Pending:
        //         System.out.println("Please Wait");
        //         break;
        //     default:
        //         System.out.println("Done!");
        //         break;
        // }

        // Status[] ss = Status.values();
        // for(Status c : ss) {
        //     System.out.println(c + " : " + c.ordinal());
        // }
    }
}
