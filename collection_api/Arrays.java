package collection_api;

import java.util.*;

public class Arrays {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(6);
    nums.add(7);
    nums.add(8);
    nums.add(9);
    nums.add(10);
    // nums.add("10"); //compile time error for  <Integer>
    System.out.println(nums);
    for (int i : nums) {
      System.out.println(i);
      
    }
    for (Object i : nums) {
      System.out.println(i);
    }
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println(nums.indexOf(9));
    System.out.println(nums.get(0));


    // Collection set= new HashSet<>();
    
  }
}
