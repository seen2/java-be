
import java.util.*;


/*
 * 
 Java doesn't have a built-in concept of "generators" in the same way that languages like Python or JavaScript do. In those languages, generators provide a way to define functions that can pause execution and yield values iteratively, without building an entire result set in memory at once.

Why Java Doesn't Have Traditional Generators:

Iterator Pattern: Java already has a robust mechanism for iteration using the Iterator and Iterable interfaces. This pattern provides a standardized way to traverse collections and sequences.
Memory Management: Java's automatic garbage collection makes it less critical to have generators for managing large data streams. The garbage collector can efficiently reclaim memory from intermediate objects created during iteration.
How to Achieve Generator-like Behavior in Java:

Iterators: You can implement the Iterator interface to create custom iterators that define how to traverse a data structure and produce values on demand.
 */
public class Generators {

    public static void main(String[] args) {
        System.out.println("Generators");
        //generators
        MyIterator iterator = new MyIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class MyIterator implements Iterator<Integer> {

    private int current;

    public MyIterator(int start) {
        this.current = start;
    }

    @Override
    public boolean hasNext() {
        return current <= 10; // Example condition
    }

    @Override
    public Integer next() {
        return current++;
    }
}
