import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInInput {
    public static void main(String args[]) throws IOException {
        System.out.print("Enter a number: ");
        // int num = 0;

        // try {
        //     num = System.in.read();
        // } catch (IOException e) {
        //     System.out.println("Error reading input: " + e.getMessage());
        // }

        // System.out.println(num);

        // Old way : Using BufferedReader
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num / 3);

        // bf.close();

        // Shorter way: Using Scanner class
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
