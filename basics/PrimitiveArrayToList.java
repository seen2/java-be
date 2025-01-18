import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveArrayToList {

    public static void main(String[] args) {
        // Example with int array
        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("intList: " + intList);

        // Example with double array
        double[] doubleArray = {1.1, 2.2, 3.3};
        List<Double> doubleList = Arrays.stream(doubleArray).boxed().collect(Collectors.toList());
        System.out.println("doubleList: " + doubleList);

        // Example with char array
        char[] charArray = {'a', 'b', 'c'};
        List<Character> charList = new String(charArray).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("charList: " + charList);

        // Example with boolean array (using primitive wrapper class)
        boolean[] booleanArray = {true, false, true};
        List<Boolean> booleanList = new ArrayList<>();
        for (boolean value : booleanArray) {
            booleanList.add(value);
        }
        System.out.println("booleanList: " + booleanList);

        // Example with short array (using primitive wrapper class)
        short[] shortArray = {1, 2, 3};
        List<Short> shortList = new ArrayList<>();
        for (short value : shortArray) {
            shortList.add(value);
        }
        System.out.println("shortList: " + shortList);
        // Example with long array
        long[] longArray = {1L, 2L, 3L};
        List<Long> longList = Arrays.stream(longArray).boxed().toList();
        System.out.println("longList: "        + longList);

        // Example with byte array
        byte[] byteArray = {1, 2, 3};
        List<Byte> byteList = new ArrayList<>();
        for (byte value : byteArray) {
            byteList.add(value);
        }
        System.out.println("byteList: " + byteList);
    }
}