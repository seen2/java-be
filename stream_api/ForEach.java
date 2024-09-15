package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(7,8,9,10,1,2,3,4);
    int sum=0;
    for (Integer num : nums) {
        if(num%2==0){
            sum+=num;
        }
    }
    System.out.println(sum);
    //Transformation
    System.out.println(">>>>>>>>>>>>>>Transformation>>>>>>>>>>>>>>>>>");
    Consumer<Integer> con = new Consumer<>(){
      @Override
      public void accept(Integer n){
        System.out.println(n);
      }
    };
    con = (n)->{
      System.out.println(n);
    };
    con =n->System.out.println(n);
    nums.forEach(con);
    //shortcut below instead on con use expression itself
    nums.forEach(e->System.out.println(e));

    // nums.stream().forEach(System.out::println);
  }
}
