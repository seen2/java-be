package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 9, 7, 6);

        // Reduce - Classic way (summation)
        System.out.println("Reduce (Sum) - Classic:");

        // Define the BiFunction using an anonymous class
        BiFunction<Integer, Integer, Integer> adder = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        // Use the BiFunction with reduce
        Integer sum = nums.stream().reduce(0, adder::apply);
        System.out.println(sum);
        // sum = nums.stream().reduce(0, (a,b)->{
        //   return a + b;
        // });
        sum = nums.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        },
        (a, b) -> {
            return a * b;
        });
        System.out.println(sum);

        List<String> words = Arrays.asList("Hello", "World", "Java");

        int totalLength = words.stream()
                .reduce(0, // identity (Integer)
                        (length, word) -> length + word.length(), // accumulator
                        Integer::sum); // combiner (optional for sequential streams)

        System.out.println(totalLength);
        // Integer strLen = words.stream().reduce(0,new BinaryOperator<Integer>() {
        //     @Override
        //     public Integer apply(Integer len, String b) {
        //         return len + b.length();
        //     }
            
        // });
        Integer strLen = words.stream().reduce(0,(a, b) -> { 
            System.out.println("Accumulator, a = " + a + ", b = " + b);
            return a + b.length();
        },
        (a, b) -> {
            System.out.println("Combiner");
            return a * b;
        }
        );
        System.out.println(strLen);

        strLen = words.stream().reduce(0, new BiFunction<Integer, String, Integer>() {
            @Override
            public Integer apply(Integer a, String b) {
                return a + b.length();
            }
        }, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a * b;
            }
        });
        System.out.println(strLen);

    }
}
