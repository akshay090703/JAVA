import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeyword {
    public static void main(String args[]) throws IOException {
        int num = 0;
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // try{
        //     num = Integer.parseInt(br.readLine());

        //     System.out.println(num);
        // } catch(IOException err) {
        //     System.out.println("Error: " + err.getMessage());
        // } finally{
        //     System.out.println("This is the finally block");
        //     br.close();
        // }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException err) {
            System.out.println("Error: " + err.getMessage());
        }
    }
}
