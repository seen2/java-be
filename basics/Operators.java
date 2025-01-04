public class Operators{
  public static void main(String []args){
    System.out.println("Math operations");
    int a=3,b=4;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    //floating point division
    float c=3.0f,d=4.0f,res=(float)a/(float)b;
    System.out.println(c/d);
    System.out.println(c%d);
    System.out.println(res);

    //increment decrement operators
    System.out.println("Increment and decrement operators");
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(a--);
    System.out.println(--a);
     // Write a Java program to demonstrate the use of the bitwise operators (&, |, ^, ~, <<, >>).
     a=3;b=5;
     System.out.println(a&b); //bitwise and example 3=11, 5=101, 3&5=1 =>1
     System.out.println(a|b); //bitwise or  example 3=11, 5=101, 3|5=111 =>7
     System.out.println(a^b); //bitwise xor example 3=11, 5=101, 3^5=110 =>6
     System.out.println(~a);  //bitwise not example 3=11, ~3=100 =>4
     System.out.println(a<<b); // bitwise left shift example 3=11, b=5, 3<<5 = 1100000 => 96
     System.out.println(a>>b); // bitwise right shift example 3=11, b=5, 3>>5 = 00000->{11}^-1 => 0
  }

  /**
   * 1. What will be the output of the following code?
   * int a = 3, b = 4;
   * System.out.println(a++ + b); // Output: 7
   * System.out.println(++a + b); // Output: 9
   * System.out.println(a-- + b); // Output: 9
   * System.out.println(--a + b); // Output: 7
   */
}