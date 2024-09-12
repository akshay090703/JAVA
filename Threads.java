// class L implements Runnable {
//     public void run() {
//         for(int i = 1; i<=7; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class M implements Runnable {
//     public void run() {
//         for(int i = 1; i<=7; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Threads {
    public static void main(String args[])  {
        // L obj1 = new L();
        // M obj2 = new M();

        // obj2.setPriority(Thread.MAX_PRIORITY);
        // obj1.start();
        // obj2.start();

        // try{
        //     Thread.sleep(20);
        // } catch(InterruptedException e) {
        //     e.printStackTrace();
        // }

        // As Runnable is a functional interface so can be converted to lambda expressions
        Runnable obj1 = () -> {
            for(int i = 1; i<=7; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        Runnable obj2 = () -> {
            for(int i = 1; i<=7; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
