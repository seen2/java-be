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
