// class myNewException extends Exception {
class myNewException extends RuntimeException {
    public myNewException(String message) {
        super(message);
    }
}

public class ThrowKeyword {
    public static void main(String args[]) {
        int i = 20, j = 0;

        try {
            j = 18 / i;

            if(j == 0) {
                throw new myNewException("Result is 0");
            }
        } catch(myNewException err) {
            System.out.println("New Exception: " + err);
        } catch(ArithmeticException err) {
            j = 18 / 1;
            System.out.println("Thats the default output");
        } catch(Exception err) {
            System.out.println("Something went wrong: " + err.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
