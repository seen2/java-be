package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 9, 7, 6);
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));
        //  s1.forEach(n->System.out.println(n)); // streams can't be re operated
        nums.stream().filter((a) -> a % 2 == 0).forEach(e -> System.out.println(e));
        nums.stream().map(e -> e * e).forEach(e -> System.out.println("square: " + e));
        Integer n = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(n);

        // all in one
        int sumOfSquareOfEvenNumbers = nums.stream().filter(e -> e % 2 == 0).map(e -> e * e).reduce(0, (a, b) -> a + b);
        System.out.println(sumOfSquareOfEvenNumbers);

        //explanations 
        // filter
        System.out.println("Filter");
        Predicate<Integer> pred = new Predicate<>() {
            @Override
            public boolean test(Integer o) {
                return o % 2 == 0;
            }

        };

        pred = (a) -> {
            return a % 2 == 0;
        };
        pred = a -> a % 2 == 0;
        nums.stream().filter(pred).forEach(e -> System.out.println(e));
        //map
        System.out.println("Map");
        Function<Integer, Integer> func = new Function<>() {

            @Override
            public Integer apply(Integer a) {
                return a * a;
            }

        };

        func = (a) -> {
            return a * a;
        };

        func = a -> a * a;

        nums.stream().map(func).forEach(e -> System.out.println(e));

        //reduce
        System.out.println("Reduce");

        BiFunction<Integer,Integer,Integer> bi= new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        Integer sum = nums.stream().reduce(0, (BinaryOperator<Integer>)bi);
        System.out.println(sum);

        //sorted
        System.out.println("Sorted");
        nums.stream().sorted().forEach(e->System.out.println(e));
        List<Student> students=new ArrayList<>();
        students.add(new Student("John",21));
        students.add(new Student("Adam",29));
        students.add(new Student("David",11));
        students.add(new Student("Peter",31));
        students.stream().sorted().forEach(e->System.out.println(e));
        students.stream().sorted().forEach(e->System.out.println(e));
        //
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
        System.out.println(students);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        students.stream().sorted(studentComparator).forEach(e->System.out.println(e));
    }

}

class Student implements Comparable<Student> {

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

