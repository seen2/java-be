public class Type{
  public static void main(String []a){
    System.out.println("Hello");
    float f=1f;
    double d=1;
    int i=257;
    short s=2;
    long l=1;
    byte b=127;
    System.out.println(l);
    System.out.println(Long.BYTES);
    System.out.println(Integer.BYTES);
    System.out.println(Short.BYTES);
    System.out.println(Byte.BYTES);
    System.out.println("Floating point numbers");
    System.out.println(f);
    System.out.println(d);
    System.out.println(Float.BYTES);
    System.out.println(Double.BYTES);
    //get memory size of a char variable
    System.out.println("Chars");
    char c='a';
    System.out.println(c);
    // binary in java
    System.out.println("Binary");
    int binary=0b0101;
    System.out.println(binary);
    System.out.println(Integer.toBinaryString(binary));
    System.out.println("Implicit conversion");
    int j=s;
    int k=c;
    System.out.println(j);
    System.out.println(k);

    // type casting in java
    System.out.println("Type casting: explicit conversion");
    System.out.println((byte)c);
    System.out.println((float)i);
    System.out.println(b);
    System.out.println("overflow");
    System.out.println((byte)i); //as byte max range is 256 it wont take 257 and replace it with the value of i%256 which is 1 here


    // get asci code of any char
    System.out.println("UNICODE");
    System.out.println((byte)c);
    System.out.println((int)c);

    System.out.println((char)(byte)c);

    // type promotion
    System.out.println("Type promotion");
    byte x=30,y=10;
    int z=x*y;
    System.out.println(z);

  }
}