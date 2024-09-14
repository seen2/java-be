
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        // System.out.println("Hello, Please enter");

        // try {
        //     int n = System.in.read();
        //     System.out.println("Hello " + (char) n);
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Thank you");
        // }
        System.out.println("Hello, Please enter your name");
        // InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = br.readLine();
            System.out.println("Hello " + name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thank you");
        }
        System.out.println("Hello, Please enter your name");
        
        try (Scanner sc = new Scanner(System.in)) {
          String name = sc.nextLine();
            System.out.println("Hello " + name);
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        } finally {
            System.out.println("Thank you");
        }
    }
}
