package collection_api;

import java.util.*;

public class Maps {
  public static void main(String[] args) {
    Map<String,Integer> studentMarksRecord = new HashMap<>();
    // Map<String,Integer> studentMarksRecord = new Hashtable<>(); //use synchronised map(HashTable) when want to be thread safe
    studentMarksRecord.put("Mohan", 11);
    studentMarksRecord.put("Sahul", 91);
    studentMarksRecord.put("Richa", 71);
    studentMarksRecord.put("Richa", 81); //update
    System.out.println(studentMarksRecord);
    System.out.println(studentMarksRecord.get("Mohan"));

    Set<String> stundesName= studentMarksRecord.keySet();
    for(String name:stundesName){
      System.out.println(name+ ": "+ studentMarksRecord.get(name));
    }

    //sorted Map
    Map<String,Integer> studentMarksRecord1 = new TreeMap<>();
    studentMarksRecord1.put("Mohan", 11);
    studentMarksRecord1.put("Sahul", 91);
    studentMarksRecord1.put("Richa", 71);
    studentMarksRecord1.put("Richa", 81); //update
    System.out.println(studentMarksRecord1);
    
  }
}
