
import java.util.Scanner;

/*
Write a Java program to demonstrate the use of try-catch blocks.
Write a Java program to demonstrate the use of throw and throws keywords.
Write a Java program to demonstrate the use of finally blocks.
Write a Java program to demonstrate the use of exception chaining.
Write a Java program to demonstrate the use of custom exceptions.
 */

public class CustomException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter two numbers");
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a < 0 || b < 0) {
        throw new TypeException("Negative numbers are not allowed");
      }
      int c = divide(a, b);
      System.out.println(c);
    } catch (ArithmeticException | TypeException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Something went wrong");
    } finally {
      try {
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = divide(a, b);
        System.out.println(c);
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } finally {
        sc.close();
      }
    }

  }

  public static int divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("Division By Zero Error, can't divide by zero");
    }
    return a / b;
  }
}

class TypeException extends Exception {
  public TypeException(String message) {
    super(message);
  }
}
