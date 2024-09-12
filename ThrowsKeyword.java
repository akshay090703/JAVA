class K {
    public void show() throws ClassNotFoundException {
        // Checked Exception
        // Have to handle the exception
        Class.forName("absy");
    }
}

public class ThrowsKeyword {
    public static void main(String args[]) {
        K obj = new K();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
