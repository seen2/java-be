package collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(7);
        nums.add(9);
        System.out.println(nums);
        Collections.sort(nums); //default
        System.out.println(nums);
        //comparator
        @SuppressWarnings("Convert2Lambda")
        Comparator<Integer> comp = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else if (a % 10 < b % 10) {
                    return -1;
                } else {

                    return 0;
                }
            }
        };
        Collections.sort(nums, comp);
        System.out.println(nums);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John",21));
        studentList.add(new Student("Adam",29));
        studentList.add(new Student("David",11));
        studentList.add(new Student("Peter",31));

        @SuppressWarnings("Convert2Lambda")
        Comparator<Student> studentComparator = new Comparator<>() {

            @Override
            public int compare(Student a, Student b) {
                if (a.getAge() > b.getAge()) {
                    return 1;
                } else if (a.getAge() < b.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        };
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(studentList);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Collections.sort(studentList, studentComparator);
        System.out.println(studentList);
        for (Student student : studentList) {
            System.out.println(student.getName() + " " + student.getAge());
        }
        Collections.sort(studentList);
        System.out.println(studentList);

    }

   static class Student implements Comparable<Student> {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // @Override
        // public String toString() {
        //     return "Student{" +
        //             "name='" + name + '\'' +
        //             ", age=" + age +
        //             '}';
        // }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Student{");
            sb.append("name=").append(name);
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
        @Override
        public int compareTo(Student o) {
          if(this.name.compareTo(o.name)>0){
            return 1;
          }else if(this.name.compareTo(o.name)<0){
            return -1;
          }else{
          return 0;
          }
        }

    }
}


/*
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

*/

/*
Write a Java program to demonstrate the use of ArrayList.
Write a Java program to demonstrate the use of LinkedList.
Write a Java program to demonstrate the use of HashSet.
Write a Java program to demonstrate the use of HashMap.
Write a Java program to demonstrate the use of TreeSet.
Write a Java program to demonstrate the use of Comparator.
Write a Java program to demonstrate the use of Collections.sort.

 */
/*
public class Exc {
    public static void main(String[] args) {
  
      List<Object> arrList = new ArrayList<>();
      arrList.add(1);
      arrList.add("String");
      System.out.println(arrList);
  
      List<Object> linkedList = new LinkedList<>();
      linkedList.add(1);
      linkedList.add("String");
      System.out.println(linkedList);
  
      Set<Number> hashSet= new HashSet<>();
      hashSet.add(1);
      hashSet.add(2.2);
      hashSet.add(3.1);
      hashSet.add(4);
      hashSet.add(5);
      System.out.println(hashSet);
  
      Map<String,Object> hashMap= new HashMap<>();
      hashMap.put("a", 1);
      hashMap.put("b", 2);
      hashMap.put("c", 3);
      hashMap.put("d", 4);
      System.out.println(hashMap);
  
      Set<Integer> treeSet= new TreeSet<>();
      treeSet.add(1);
      treeSet.add(2);
      treeSet.add(3);
      treeSet.add(4);
      treeSet.add(5);
      System.out.println(treeSet);
  
      List<Student> studentList = new ArrayList<>();
      studentList.add(new Student("John",21));
      studentList.add(new Student("Adam",29));
      studentList.add(new Student("Bob",24));
      studentList.add(new Student("Alice",20));
      Collections.sort(studentList);
      System.out.println(studentList);
  
      List<Man> manList = new ArrayList<>();
      manList.add(new Man("John",21));
      manList.add(new Man("Adam",29));
      manList.add(new Man("Bob",24));
      manList.add(new Man("Slice",20));
      Comparator<Man> comp = new Comparator<>() {
        @Override
        public int compare(Man a, Man b) {
          return a.getName().compareTo(b.getName());
        }
      };
      Collections.sort(manList,comp);
      System.out.println(manList);
      Comparator<Man> comp1 = (a,b)->{
        return a.getAge()-b.getAge();
      };
      Collections.sort(manList,comp1);
      System.out.println(manList);
      
    }
  
    
  }
  
  class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name,int age){
      this.name=name;
      this.age=age;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
  
    @Override
    public int compareTo(Student o) {
      if(this.name.compareTo(o.name)>0){
        return 1;
      }else if(this.name.compareTo(o.name)<0){
        return -1;
      }else{
      return 0;
      }
    }
  
    @Override
    public String toString() {
      return "Student [name=" + name + ", age=" + age + "]";
    }
  
  }
  
  class Man{
    private String name;
    private int age;
  
    public Man(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    @Override
    public String toString() {
      return "Man [name=" + name + ", age=" + age + "]";
    }
  }
  
  
 */