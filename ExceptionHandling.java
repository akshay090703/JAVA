public class ExceptionHandling {
    public static void main(String args[]) {
        int i = 2, j = 0;

        int nums[] = new int[5];
        String str = null; // by default null

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch(ArithmeticException err) {
            System.out.println("Cannot divide by 0.");
        } catch(ArrayIndexOutOfBoundsException err) {
            System.out.println("Stay in your limits :)");
        } catch(Exception err) {
            System.out.println("Something went wrong: " + err.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
