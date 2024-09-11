package tools;

public class Calculator{
  public static void main(String []args){
    System.out.println("Math operations");
    int a=3,b=4;
    System.out.println(Maths.add(a,b));
    System.out.println(Maths.sub(a,b));
    System.out.println(Maths.mul(a,b));
    System.out.println(Maths.div(a,b));
    System.out.println(Maths.mod(a,b));
    System.out.println(Maths.mul(a,b,30));
    System.out.println(Maths.add(a,b,30));
    System.out.println(Maths.add(a,b,30,1,2,3,4,5,6,7,8,9,10));


  }
}

class Maths{
  public static int add(int a,int b){
    return a+b;
  }
  
  //uncountable params
  public static int add(int... args){
    int sum=0;
    for(int i=0;i<args.length;i++) sum+=args[i];
    return sum;
  }
  public static int sub(int a,int b){
    return a-b;
  }
  public static int mul(int a,int b){
    return a*b;
  }
  //overloading
  public static int mul(int a,int b, int c){
    return a*b*c;
  }
  public static int div(int a,int b){
    return a/b;
  }
  public static int mod(int a,int b){
    return a%b;
  }
  
}