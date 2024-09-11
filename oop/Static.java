public class Static {

  public static void main(String[] args) {
      System.err.println("PIE = "+Math.PIE);
      System.err.println("E = "+Math.E);
      System.err.println("PIE+E = "+Math.getPIEE());
  }
}

class Math{
  public final static double PIE = 3.14159265358979323846;
  public final static double E = 2.71828182845904523536;

  public static double getPIEE(){
    return Math.PIE+Math.E;
  }

}
