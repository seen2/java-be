
import java.util.Arrays;
public class VariableArgument {
  public static void main(String... args) { //not recommended
    System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
      
  }

  public static int sumAll(int... nums) {
    return Arrays.stream(nums).sum();
  }
}
