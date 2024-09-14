package collection_api;

import java.util.*;

public class Sets{
  public static void main(String[] args) {

    Set<Integer> nums = new HashSet<>();
    nums.add(71);
    nums.add(8);
    nums.add(9);
    nums.add(6);
    nums.add(10);
    nums.add(8);
    System.out.println(nums);

    System.out.println(new ArrayList<>(nums).indexOf(10));

    //sorted set
    System.out.println("Sorted set");
    Set<Integer> nums1 = new TreeSet<>();
    nums1.add(71);
    nums1.add(8);
    nums1.add(9);
    nums1.add(6);
    nums1.add(10);
    nums1.add(8);
    System.out.println(nums1);
    System.out.println(new ArrayList<>(nums1).indexOf(10));

    //Iterator
    Iterator<Integer> values=nums.iterator();
    while(values.hasNext()){
      System.out.println(values.next());
    } 
    
  }

}