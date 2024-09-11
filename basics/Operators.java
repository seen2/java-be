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
  }
}