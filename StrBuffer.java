public class StrBuffer {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Akshay");
        System.out.println(sb.length());
        // System.out.println(sb.reverse()); // changes the original data 
        System.out.println(sb.substring(2, 5));
    }
}
