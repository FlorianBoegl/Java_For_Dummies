package Kapitel15_Maps_Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest<T> {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("abc");
        queue.offer("123");
        queue.offer("efg");
        queue.add("addtest");
        String test = queue.peek();
        String test2 = queue.element();

        System.out.println(test);
        System.out.println(test2);
        try {
            while (!queue.isEmpty()) {
                System.out.println("" + queue.remove());
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("NoSuchElementException");
        }
        //while ((test = queue.poll()) != null)
        //    System.out.println("schleife: " + test);
    }
}
